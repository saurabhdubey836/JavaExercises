package co.saurabh.entity.product;

public class Product {
	
	private final int id;
	private String name;
	private double price;
	
	public Product(int id){
		this.id = id;
	}
	/*public void set_id(int id) {
		if(id > 0) {
			this.id = id;
		}else {
			throw new RuntimeException("Invalid input");
		}
	}*/
	public int getId() {
		return id;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price<0) {
			throw new RuntimeException("Invalid Price");
		}else this.price = price;
	}
	
	public static void print(Product p1) {
		System.out.println("id= "+ p1.getId());
		System.out.println("Price= "+p1.getPrice());
		System.out.println("Name= "+p1.getName());
	}
}
