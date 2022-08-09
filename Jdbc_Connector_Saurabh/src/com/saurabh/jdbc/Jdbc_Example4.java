package com.saurabh.jdbc;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class Jdbc_Example4 {

	public static void main(String[] args) throws SQLException, NumberFormatException, IOException{
		EmployeeDAO dao = new EmployeeDAO();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
			  //Menu options
			System.out.println("1.) get details");
			System.out.println("2.) Insert new Details");
			System.out.println("3.) Update Details based on amount");
			System.out.println("4.) Delete Details");
			System.out.println("5.) Getting all the details...");
			System.out.println("6.) Exit\n");
			System.out.println("\nEnter Your Menu Choice: ");
			
			choice = sc.nextInt();
			  switch(choice){
			  case 1 : 
				  System.out.println("Enter employee id");
				  int eid = sc.nextInt();
				  Employee e1 = dao.getDetails(eid);
				  System.out.println(e1.getEname());
				  System.out.println(e1.getEadd());
				  break;
				  
			  case 2:
				  System.out.println("Insert new details");
				  dao.enterDetails();
				  break;
				  
			  case 3:
				  System.out.println("Update Details based on amount");
				  dao.updateDetails();
				  break;
				  
			  case 4:
				  System.out.println("Delete Details based on amount");
				  dao.deleteDetails();
				  break;
			     
			  case 5:
				  System.out.println("Getting all the details...");
				  List<Employee> emp = dao.getAllDetails();
				  Iterator<Employee> itr = emp.iterator();
				  
				  while(itr.hasNext()) {
					  Employee it = itr.next();
					  int id = it.getEno();
					  String name = it.getEname();
					  float esal = it.getEsal();
					  String eadd = it.getEadd();
					  
					  System.out.println(id+" "+name+" "+esal+" "+eadd);
				  }
				  break;
				  
			  case 6:
				  System.out.println("Exiting Program...");
		          System.exit(0);
		          break;
			  
			  default:
			      System.out.println("Invalid menu choice; try again.");
			      break;
			   }
			}while(choice != 6);		
	}
}
