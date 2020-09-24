package co.saurabh.entity;

public class Product {
	private String name;
	private String lname;
	private String place;
	
	public Product(){
	}
	
	public Product(String name) {
		this(name,null,"Bangalore");
	}
	
	public Product(String name,String lname,String place) {
		this.name=name;
		this.lname=lname;
		this.place=place;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return String.format(""
				+ "Product [name=%s, lname=%s, place=%s]", name, lname, place);
	}
}
