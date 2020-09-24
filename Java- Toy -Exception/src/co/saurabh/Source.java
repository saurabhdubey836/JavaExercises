package co.saurabh;

import java.util.Scanner;

class InvalidAgeException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    
}
class Toy{
    private int id;
    private String name;
    private int minAge;
    private int maxAge;
    
    Toy(){
        
    }
    Toy(int id,String name,int minAge,int maxAge){
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
    void setMinAge(int minAge){
        this.minAge = minAge;
    }
    
    void setMaxAge(int maxAge){
        this.maxAge = maxAge;
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
public class Source 
{
	 String[][] toys=new String[5][5];
	Source()
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
	    Scanner sc = new Scanner(System.in);
	    int id = sc.nextInt();
	    sc.nextLine();
	    String name = sc.nextLine();
	    int minAge = sc.nextInt();
	    int maxAge = sc.nextInt();
	    
	    Toy toy = new Toy();
	    
	    toy.setName(name);
	    toy.setId(id);
	    toy.setMinAge(minAge);
	    toy.setMaxAge(maxAge);
	    
	    try {
			if((toy.getMaxAge() > 12) ||( toy.getMinAge()<0)) {
				throw new InvalidAgeException();
			}else {
				String actual = toy.getToyName();
				System.out.println(actual);
			}
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid Age");
		}
    	
	}
}
		 
