package com.digital.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.digital.entity.Cart;
import com.digital.entity.ProductInfo;
import com.digital.service.ProductInfoService;
import com.opensymphony.xwork2.ActionSupport;

public class CartAction extends ActionSupport implements SessionAware{
           private int productInfoId;
           private int quantity;
           private ProductInfoService pis;
           private Map<String, Object> session;
           
           public String addCart() {
        	   Map cart=(Map)session.get("CART");
        	   if(cart==null) {
        		   cart=new HashMap();
        		   session.put("CART", cart);
        	   }//从购物车当中取出购物项  cart--key-pId value--Cart
        	   ProductInfo pi=pis.getProductInfoByPid(productInfoId);
        	   Cart c=(Cart)cart.get(productInfoId);
        	   if(c==null) { //若购物车中无此商品
        		   Cart ct=new Cart(pi,1);
        		   cart.put(pi.getId(), ct);
        	   }else {
        		   c.setQuantity(c.getQuantity()+1); 
        	   }
        	   return "cart";
           }public String updateCart() {
        	   Map cart=(Map)session.get("CART");
        	   Cart c=(Cart)cart.get(productInfoId);
        	   c.setQuantity(quantity);
        	   return "cart";
           }
           public String deleteCart() {
        	   Map cart=(Map)session.get("CART");
        	   cart.remove(productInfoId);
        	   return "cart";
           }
           
           public String clearCart() {
        	   Map cart=(Map)session.get("CART");
        	   cart.clear();
        	   return "cart";
           }
        
		public int getProductInfoId() {
			return productInfoId;
		}
		public void setProductInfoId(int productInfoId) {
			this.productInfoId = productInfoId;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public ProductInfoService getPis() {
			return pis;
		}
		public void setPis(ProductInfoService pis) {
			this.pis = pis;
		}
		@Override
		public void setSession(Map<String, Object> session) {
			this.session=session;
			// TODO Auto-generated method stub
			
		}
           
   
}
