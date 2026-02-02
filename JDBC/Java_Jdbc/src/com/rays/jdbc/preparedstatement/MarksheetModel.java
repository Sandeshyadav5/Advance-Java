package com.rays.jdbc.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MarksheetModel {
	
	public void adds(MarksheetBean beans) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproject","root","root");
		PreparedStatement pstmt=conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");
		pstmt.setInt(1, beans.getId());
		pstmt.setInt(2, beans.getRollNo());
		pstmt.setString(3, beans.getName());
		pstmt.setInt(4, beans.getChem());
		pstmt.setInt(5, beans.getPhy());
		pstmt.setInt(6, beans.getMaths());
		int i =pstmt.executeUpdate();
		System.out.println(i+" row inserted");
		pstmt.close();
		conn.close();
	}

	public void total(MarksheetBean beans) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcproject","root","root");
		PreparedStatement pstmt=conn.prepareStatement("select * , (phy+chem+maths) as total from marksheet;");
		
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			System.out.println("Total: " + rs.getInt(7));
			}
		pstmt.close();
		conn.close();
	}

}
