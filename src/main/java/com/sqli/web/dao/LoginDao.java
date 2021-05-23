package com.sqli.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDao {
	
	public boolean check(String uname, String pass) {
		try {
			 Class.forName("oracle.jdbc.OracleDriver");
			 String sql = "select * from login where uname=? and pass=?";
       	Connection conn=  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","aaaaaa");
       	   	PreparedStatement st = conn.prepareStatement(sql);
       	   	st.setString(1, uname);
       		st.setString(2, pass);
       		ResultSet rs = st.executeQuery();
       	   if(	rs.next()) {
       		  return true;
       	   }
		}
		catch(Exception e) {
			System.out.println(e);
		}

		
		return false;
		
	}

}
