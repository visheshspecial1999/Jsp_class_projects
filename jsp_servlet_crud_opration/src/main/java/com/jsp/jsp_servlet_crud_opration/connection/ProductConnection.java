package com.jsp.jsp_servlet_crud_opration.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProductConnection {

	// create getConnection method
	public static Connection getConnection() {
		try {
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/productdata";
			String username = "root";
			String password = "Vishesh@123";

			return DriverManager.getConnection(url, username, password);
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
