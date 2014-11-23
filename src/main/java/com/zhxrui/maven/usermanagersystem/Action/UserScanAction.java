package com.zhxrui.maven.usermanagersystem.Action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zhxrui.maven.usermanagersystem.DAO.UserDAO;
import com.zhxrui.maven.usermanagersystem.Entity.User;
import com.zhxrui.maven.usermanagersystem.ImplDAO.UserDAOImpl;

public class UserScanAction extends ActionSupport {
	private int id ;
	private User userinfo;
	public String execute(){
		UserDAO userdao= new UserDAOImpl();
		User user=(User)ActionContext.getContext().getSession().get("user");
		if(id!=0) 
			this.setUserinfo(userdao.selectUserInfo(id));
		else
			this.setUserinfo(user);
		return "success";
	}
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return this.id;
	}
	public void setUserinfo(User userinfo){
		this.userinfo= userinfo;
	}
	public User getUserinfo(){
		return this.userinfo;
	}
	
}
