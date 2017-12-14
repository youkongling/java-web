package com.digital.interceptor;

import java.util.Map;

import com.digital.entity.User;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthorizationInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Map<String, Object> session=invocation.getInvocationContext().getSession();
		User user=(User)session.get("currentUser");
		if(session==null) {
			return "login";
		}else {
			if(user==null) {
				return "login";
			}else {
				return invocation.invoke();
			}
		} 
	}

}
