package co.saurabh.entity;

//package co.saurabh;

import java.util.Scanner;

class InvalidAgeException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6417105879508170133L;

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	
	public String getMessage(){ 
		return "InvalidAgeException";
	}
}
class Toy{
  private int id;
  private String name;
  private int minAge;
  private int maxAge;
  
  Toy(){
      
  }
  Toy(int id,String name,int minAge,int maxAge) throws InvalidAgeException{
	  if(minAge <0 || maxAge > 12) {
		  throw new InvalidAgeException();
	  }
      this.id = id;
      this.name= name;
      this.minAge = minAge;
      this.maxAge = maxAge;
  }
  void setId(int id){
      this.id = id;
  }
  void setName(String name){
      this.name = name;
  }
  void setMinAge(int minAge) throws InvalidAgeException{
	  if(minAge <0) {
		  throw new InvalidAgeException();
	  }else {
		  this.minAge = minAge;
	  }
      
  }
  
  void setMaxAge(int maxAge) throws InvalidAgeException{
	  if(maxAge>12) {
		  throw new InvalidAgeException();
	  }else {
		  this.maxAge = maxAge;
	  }
      
  }
  
  int getId(){
      return this.id;
  }
  String getToyName(){
      return this.name;
  }
  int getMinAge(){
      return this.minAge;
  }
  int getMaxAge(){
      return this.maxAge;
  }
  
}
public class Source02 
{
	 String[][] toys=new String[5][5];
	Source02()
	{
	toys[0][0]="1";
	toys[0][1]="Stickle Bricks";
	
	toys[1][0]="2";
	toys[1][1]="Robot Dog";
	
	toys[2][0]="3";
	toys[2][1]="Magic 8 Ball";
	
	toys[3][0]="4";
	toys[3][1]="Juggling Clubs";
	
	toys[4][0]="5";
	toys[4][1]="Chutes and Ladders";
	

	
	}
	
/*public  String getToy(int age)
{	
}*/
	
  public static void main( String[] args ) throws InvalidAgeException
	{
	    @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	    int id = sc.nextInt();
	    sc.nextLine();
	    String name = sc.nextLine();
	    int minAge = sc.nextInt();
	    int maxAge = sc.nextInt();
	    
	    
	    
	    /*toy.setName(name);
	    toy.setId(id);
	    toy.setMinAge(minAge);
	    toy.setMaxAge(maxAge);*/
	    
	    try {
	    	Toy toy = new Toy(id,name,minAge,maxAge);
	    	System.out.println(toy.getToyName());
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
  	
	}
}
		 

