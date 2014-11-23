package com.zhxrui.maven.usermanagersystem.ImplDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zhxrui.maven.usermanagersystem.DAO.BaseDAO;

public  class BaseDAOImpl   {
	private static Connection con;
	static
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
	public static  Connection getConnection() {
		// TODO Auto-generated method stub
		try {
		  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/usermanagersystem","root","zhxrui");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static void cloasAll(ResultSet rs, PreparedStatement ps, Connection con) {
		// TODO Auto-generated method stub
		if(rs !=null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(ps !=null){
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(con != null){
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
