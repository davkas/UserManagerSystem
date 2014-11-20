package com.zhxrui.maven.usermanagersystem.Interceptor;

import java.util.List;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.zhxrui.maven.usermanagersystem.DAO.UserDAO;
import com.zhxrui.maven.usermanagersystem.ImplDAO.UserDAOImpl;

public class GetAllUserInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		UserDAO userDao= new UserDAOImpl();
		List alluserList=userDao.findAllUsers();
		List alladminList=userDao.findAllAdmins();
		arg0.getInvocationContext().getSession().put("alladminList", alladminList);
		arg0.getInvocationContext().getSession().put("alluserList",alluserList);
		return arg0.invoke();
	}

}
