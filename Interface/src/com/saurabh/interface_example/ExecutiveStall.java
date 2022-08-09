package com.saurabh.interface_example;

public class ExecutiveStall implements IStall {
	
	String stallName;
	int cost;
	String ownerName;
	int screen;
		
	@Override
	public void display() {
		System.out.println("StallName:- "+stallName+"\n"+"Cost:- "+cost+"\n"+
				"Owner Name:- "+"\n"+ownerName+"\nTv_Set"+screen);
	}
	
	public int getScreen() {
		return screen;
	}

	public void setScreen(int screen) {
		this.screen = screen;
	}
	public ExecutiveStall(String stallName, int cost, String ownerName, int screen) {
		super();
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.screen = screen;
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
