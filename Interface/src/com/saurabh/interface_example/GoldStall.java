package com.saurabh.interface_example;

public class GoldStall implements IStall{
	
	String stallName;
	int cost;
	String ownerName;
	int tvSet;
	
	public GoldStall(String stallName, int cost, String ownerName, int tvSet) {
		super();
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.tvSet = tvSet;
	}

	public String getStallName() {
		return stallName;
	}

	public void setStallName(String stallName) {
		this.stallName = stallName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("StallName:- "+stallName+"\n"+"Cost:- "+cost+"\n"+
				"Owner Name:- "+ownerName+"\nTv_Set:- "+tvSet);
	}
	
}
