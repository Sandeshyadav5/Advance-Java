package com.rays.jdbc.collableStatment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class TestCollableStatment {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproject","root","root");
		
		CallableStatement ctmt=  conn.prepareCall("{CALL searchById()}");
		ResultSet rs= ctmt.executeQuery();
		while (rs.next()) {
			System.out.println("id: " + rs.getInt(1));
			System.out.println("firstName: " + rs.getString(2));
			System.out.println("lastName: " + rs.getString(3));
			System.out.println("login: " + rs.getString(4));
			System.out.println("password: " + rs.getString(5));
			System.out.println("dob: " + rs.getDate(6));
		}ctmt.close();
		conn.close();
		
	}

}
