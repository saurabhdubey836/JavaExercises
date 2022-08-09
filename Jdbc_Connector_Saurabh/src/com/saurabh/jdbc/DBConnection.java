package com.saurabh.jdbc;
import java.sql.*;

public class DBConnection {
	
	static Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	
	public static Connection getConnection() {
		if(con == null) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		return con;		
	}
	
}
