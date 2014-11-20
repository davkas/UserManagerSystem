package com.zhxrui.maven.usermanagersystem.DAO;

import java.util.List;
import com.zhxrui.maven.usermanagersystem.Entity.*;

public interface UserDAO {
	int addUser(User user);
	boolean login(User user);
	User selectUserInfo(int id);
	List findAllUsers();
    List findNewUsers();
    int modifyUserInfo(User user);
    int deleteUser(int id);
    List findAllAdmins();
    int addAdmin(User user);
    //int modifyAdmin(User user);
   // int deleteAdmin(int id);
    int getUserid(String username,String password);
    int getUserroleId(int id);
    boolean isExistUsername(String username);

}
