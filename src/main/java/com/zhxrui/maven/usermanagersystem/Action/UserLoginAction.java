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
	
	public void setUser(User user) {
		this.user = user;
	}
	public User getUser() {
		return this.user;
	}
	public String execute(){
		System.out.println(this.user.getUsername());
		System.out.println(this.user.getPassword());
		UserDAO userdao= new UserDAOImpl();	
		boolean flag = userdao.login(this.user);
		if(flag){
			System.out.println("jinrusuccess");
			ActionContext.getContext().getSession().put("user", this.user);
			return "success";
		}
		return "input";
	}
}