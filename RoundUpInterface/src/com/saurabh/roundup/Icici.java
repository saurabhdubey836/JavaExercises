package com.saurabh.roundup;

public class Icici implements INotifications{

	@Override
	public void notificationBySms() {
		System.out.println("ICICI-Notificaton By SMS");
		
	}

	@Override
	public void notificationsByEmail() {
		// TODO Auto-generated method stub
		System.out.println("ICICI-Notificaton By Mail");
	}

	@Override
	public void notificationsByCourier() {
		// TODO Auto-generated method stub
		System.out.println("ICICI-Notificaton By Courier");
	}

}
