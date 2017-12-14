package com.digital.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.digital.entity.ProductInfo;
import com.digital.entity.Type;
import com.digital.service.ProductInfoService;
import com.digital.service.TypeService;
import com.opensymphony.xwork2.ActionSupport;

public class PrInAction extends ActionSupport implements RequestAware{
	private ProductInfo pi;
	private TypeService ts;
    private ProductInfoService pis;
	private Map<String, Object> request;
	
	public ProductInfo getPi() {
		return pi;
	}

	public void setPi(ProductInfo pi) {
		this.pi = pi;
	}
	
	public String list(){
		List<Type> typeList =ts.getAll();
		if(typeList.size()>=1) {
			request.put("typeList",typeList); 
		}
	  List<ProductInfo> piList=pis.getAll();
	  if(piList.size()>0) {
		  request.put("piList", piList);
		}
	  return "index";
	}

	public String show(){
		ProductInfo pinfo=pis.getProductInfoByPid(pi.getId()); 
		request.put("detialProductInfo", pinfo);
		return "show";
	}
	
	@Override
	public void setRequest(Map<String, Object> req) {
		this.request=req;
	}
	public void setTs(TypeService ts) {
		this.ts = ts;
	}
	public void setPis(ProductInfoService pis) {
		this.pis = pis;
	}
   
} 
