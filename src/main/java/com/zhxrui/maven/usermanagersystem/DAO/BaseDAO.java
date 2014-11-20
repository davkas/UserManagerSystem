package com.zhxrui.maven.usermanagersystem.DAO;

import java.sql.*;

public interface BaseDAO {
	/*
	 * 获取连接
	 * 
	 */
	public  Connection getConnection();
	/*
	 * 关闭连接
	 */
	public  void cloasAll(ResultSet rs,PreparedStatement ps,Connection con);
}
