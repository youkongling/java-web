package com.digital.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.digital.entity.User;
import com.digital.service.UsInService;
import com.opensymphony.xwork2.ActionSupport;

public class UsInAction extends ActionSupport implements SessionAware{
     private User ui;
     private UsInService UIS;
     private Map<String, Object> session;

 	public String doLogin() { 
 		List<User> ulist=UIS.login(ui);
 		
 		if(ulist.size()>=1) {
 			session.put("currentUser", ulist.get(0));
 			return "index";
 		}else {
 			return "login";
 		}
 	}
     
	public User getUi() {
		return ui;
	}
	public void setUi(User ui) {
		this.ui = ui;
	}
	public void setUIS(UsInService uIS) {
		UIS = uIS;
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session=session;
	}
}
