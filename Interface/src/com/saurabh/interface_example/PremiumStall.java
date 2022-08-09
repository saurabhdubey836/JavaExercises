package com.saurabh.interface_example;

public class PremiumStall implements IStall {
	
	String stallName;
	int cost;
	String ownerName;
	int projector;
		
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("StallName:- "+stallName+"\n"+"Cost:- "+cost+"\n"+
				"Owner Name:- "+ownerName+"\nnumber of project:- "+projector);
	}
	
	public int getProjector() {
		return projector;
	}

	public void setProjector(int projector) {
		this.projector = projector;
	}
	public PremiumStall(String stallName, int cost, String ownerName, int projector) {
		super();
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.projector = projector;
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
	
}
