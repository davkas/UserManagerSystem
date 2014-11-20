package com.zhxrui.maven.usermanagersystem.ImplDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.sql.Connection;
import com.zhxrui.maven.usermanagersystem.DAO.UserDAO;
import com.zhxrui.maven.usermanagersystem.Entity.User;

public class UserDAOImpl implements UserDAO {
	private java.sql.Connection con;
	private PreparedStatement ps;
	private ResultSet rs;

	public int addUser(User user) {
		// TODO Auto-generated method stub
		con= BaseDAOImpl.getConnection();
		int num=0;
		try {
			ps=con.prepareStatement("insert into t_user values(null,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,user.getUsername());
			ps.setString(2,user.getPassword());
			ps.setString(3,user.getName());
			ps.setString(4,user.getNic());
			ps.setString(5,user.getSex());
			ps.setInt(6,user.getAge());
			ps.setString(7,user.getEmail());
			ps.setString(8,user.getPhone());
			ps.setString(9,user.getSelfshow());
			ps.setInt(10,user.getRoleId());
			num=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			BaseDAOImpl.cloasAll(rs, ps, con);//¹Ø±ÕÊý¾Ý¿âµÄÁ¬½Ó
		}
		
		return num;
	}

	public boolean login(User user) {
		// TODO Auto-generated method stub
		boolean flag=false;
		con=BaseDAOImpl.getConnection();
		try {
			ps=con.prepareStatement("select * from t_user where username=? and password=?");
		
			ps.setString(1, user.getUsername());
			ps.setString(2,user.getPassword());
			rs=ps.executeQuery();
			if(rs.next())
			{
				  user.setId(rs.getInt(1));
				  user.setUsername(rs.getString(2));
			      user.setPassword(rs.getString(3));
			      user.setName(rs.getString(4));
			      user.setNic(rs.getString(5));
			      user.setSex(rs.getString(6));
			      user.setAge(rs.getInt(7));
			      user.setEmail(rs.getString(8));
			      user.setPhone(rs.getString(9));
			      user.setSelfshow(rs.getString(10));
			      user.setRoleId(rs.getInt(11));
			      flag=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			BaseDAOImpl.cloasAll(rs, ps, con);//¹Ø±ÕÊý¾Ý¿âµÄÁ¬½Ó
		}
		 return flag;
	}

	public User selectUserInfo(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public List findNewUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public int modifyUserInfo(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteUser(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List findAllAdmins() {
		// TODO Auto-generated method stub
		return null;
	}

	public int addAdmin(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getUserid(String username, String password) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getUserroleId(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isExistUsername(String username) {
		// TODO Auto-generated method stub
		return false;
	}

}
