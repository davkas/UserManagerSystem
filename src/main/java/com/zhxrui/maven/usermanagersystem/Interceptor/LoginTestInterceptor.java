package com.zhxrui.maven.usermanagersystem.Interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.zhxrui.maven.usermanagersystem.Entity.*;

public class LoginTestInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("logi验证");
		Map session= arg0.getInvocationContext().getSession();
		boolean hasUserItem= session.containsKey("user");
	    if(hasUserItem){
			User user=(User)session.get("user");
			String uname=user.getUsername();
			if(uname!=null && uname !=""){
				System.out.println("login验证通过");
				return arg0.invoke();
			}
		}
		System.out.println("login验证未通过");
		session.put("errorMsg", "您还未登录，请登录！");
		return Action.INPUT;
	}

}
