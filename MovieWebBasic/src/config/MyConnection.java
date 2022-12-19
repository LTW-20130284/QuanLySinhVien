package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
	static Connection con;
	static
	{
		try {
			// Kết nối MySQL test1
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","123456");
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		return con;
	}

}
