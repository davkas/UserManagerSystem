package usermanagersystem;

import java.io.Console;
import java.io.Writer;
import java.sql.Connection;

import com.zhxrui.maven.usermanagersystem.ImplDAO.BaseDAOImpl;

public class BaseDaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con= BaseDAOImpl.getConnection();
		if(con!=null)
			System.out.println("success");
		else
			System.out.println("failed");
		

	}

}
