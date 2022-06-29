package context;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	private final String user = "root";
	private final String pass = "thanhnhan1561999";

	public Connection getConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/shoesdb";
		return DriverManager.getConnection(url, user, pass);
	}

//	public static void main(String[] args) {
//		try {
//			
//			System.out.println(new DBConnect().getConnection());
//		} catch (Exception e) {
//		}
//	}
	
}
