package com.sqli.web.dao;

import com.sqli.web.model.Alien;
import java.sql.*;

public class AlienDao {
	
	public Alien getAlien(int aid) {
		
		Alien a = new Alien();
				
		try {
			 Class.forName("oracle.jdbc.OracleDriver");

        	Connection conn=  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","aaaaaa");
        	   	Statement st = conn.createStatement();
        	   	ResultSet rs = st.executeQuery("select * from alien where aid="+aid);
        	   if(	rs.next()) {
        		   a.setAid(rs.getInt("aid"));
        		   a.setAname(rs.getString("aname"));
        		   a.setTech(rs.getString("tech"));
        	   }
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return a;
	}

}
