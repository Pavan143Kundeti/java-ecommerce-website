package com.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect 
{

	private static Connection conn = null;
	
	public static Connection getConn()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
				"jdbc:mysql://mysql-3abbf63-java-ecommerce-application.f.aivencloud.com:28545/defaultdb?ssl-mode=REQUIRED",
				System.getenv("DB_USER"),
				System.getenv("DB_PASS")
			);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
}
