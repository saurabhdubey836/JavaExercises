package co.saurabh; 

public class Address {
	private String city;
	private String state;
	private int  zip;
	private String country;
	private Customer cust = new Customer();
	
	public Address() {
	}
	
	public Address(String city, String state, int zip, String country, Customer cust) {
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
		this.cust = cust;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void print() {
		System.out.println(cust);
		System.out.println(this.city+" "+this.state+" "+this.zip+" "+this.country);
	}
	
}
