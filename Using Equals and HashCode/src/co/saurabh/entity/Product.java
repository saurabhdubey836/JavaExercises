package co.saurabh.entity;

import java.util.Objects;

public class Product {
	private int id;
	private String item;
	private String feedBack;
	
	
	public Product(int id, String item, String feedBack) {
		this.id = id;
		this.item = item;
		this.feedBack = feedBack;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getFeedBack() {
		return feedBack;
	}
	public void setFeedBack(String feedBack) {
		this.feedBack = feedBack;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(feedBack, id, item);
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
		return Objects.equals(feedBack, other.feedBack) && id == other.id && Objects.equals(item, other.item);
	}
	
	@Override
	public String toString() {
		return String.format("Product [id=%s, item=%s, feedBack=%s]", id, item, feedBack);
	}
	
	
}
