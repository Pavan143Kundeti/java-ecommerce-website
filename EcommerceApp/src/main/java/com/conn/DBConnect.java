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
				"jdbc:mysql://localhost:3306/ecommerceapp?useSSL=false&serverTimezone=UTC",
				"root", // <-- replace with your MySQL username
				"Pavan@3048"  // <-- replace with your MySQL password
			);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
}
