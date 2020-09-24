package co.saurabh;

public class Customer {
	private int customerId;
	private String customerName;
	private String password;
	private String address;
	private String email;
	
	public Customer() {
	}
	
	public Customer(int customerId, String customerName, String password,  String email) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.password = password;
		//this.address = address;
		this.email = email;
	}

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return String.format("  %s %s %s %s", customerId,
				customerName, password, email);
	}

	
	
}
