package co.saurabh.entity;

import java.util.Objects;

public class Product implements Cloneable{
	
	private String firstName;
	private String lastName;
	private String location;
	
	public Product(){
	}

	public Product(String firstName, String lastName, String location) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.location = location;
	}
	public Product replicate() throws CloneNotSupportedException {
		return (Product) clone();
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return String.format("Product [firstName=%s, lastName=%s, location=%s]", firstName, lastName, location);
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, location);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Product)) {
			return false;
		}
		Product other = (Product) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(location, other.location);
	}
	
	
	
}
