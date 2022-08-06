package com.saurabh.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDAO{
	
	public Employee getDetails(int empId) throws SQLException {
		try {
			String query = "select ename from emp where eno="+empId;
			Employee e = new Employee();
			e.setEno(empId);
			Statement st = DBConnection.getConnection().createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			String name = rs.getString(1);
			e.setEname(name);
			return e;
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
		
	}
	
	public void enterDetails() throws SQLException, NumberFormatException, IOException {
		try {
			Employee e = new Employee();
			Statement st = DBConnection.getConnection().createStatement();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
				System.out.println("Employee No: ");
				int eno = Integer.parseInt(br.readLine());
				e.setEno(eno);
				
				System.out.println("Employee Name: ");
				String ename = br.readLine();
				e.setEname(ename);
				
				System.out.println("Employee Salary");
				float esal = Float.parseFloat(br.readLine());
				e.setEsal(esal);
				
				System.out.println("Employee Address: ");
				String eadd = br.readLine();
				e.setEadd(eadd);
				
				st.executeUpdate("insert into emp values("+e.getEno()+",'"+e.getEname()+"',"+e.getEsal()+",'"+e.getEadd()+"')");
				System.out.println("Employee inserted successfully");
				
				System.out.println("Add one or more Employee[yes/no]? :");
				String option = br.readLine();
				if(option.equalsIgnoreCase("yes")) {
					continue;
				}
				else {
					break;
				}
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void updateDetails() throws SQLException, NumberFormatException, IOException {
		try {
			Employee e = new Employee();
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			Statement st = con.createStatement();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Salary Range : ");
			float salrange = Float.parseFloat(br.readLine());
			System.out.println("Bonus Amount := ");
			int bonus = Integer.parseInt(br.readLine());
			int rowcount = st.executeUpdate("Update emp set esal = esal+ "+bonus+" where esal<= "+salrange);
			System.out.println("Records Updated successfully"+rowcount);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void deleteDetails() throws SQLException, NumberFormatException, IOException {
		try {
			Employee e = new Employee();
			Statement st = DBConnection.getConnection().createStatement();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Salary Range : ");
			float salrange = Float.parseFloat(br.readLine());
			int rowcount = st.executeUpdate("delete from emp where esal<= "+salrange);
			System.out.println("Records Deleted: "+rowcount);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}	
}

