package com.zhxrui.maven.usermanagersystem.Action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zhxrui.maven.usermanagersystem.DAO.UserDAO;
import com.zhxrui.maven.usermanagersystem.Entity.User;
import com.zhxrui.maven.usermanagersystem.ImplDAO.UserDAOImpl;

public class UserLoginAction extends ActionSupport {
	/**
	 * 
	 */
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		this.user = user;
	}
	public String execute(){
		UserDAO userdao= new UserDAOImpl();	
		System.out.println("jinrusuccess");
		boolean flag = userdao.login(user);
		if(flag){
			System.out.println("jinrusuccess");
			ActionContext.getContext().getSession().put("user", user);
			
			return "success";
		}
		return "input";
	}
}