package com.saurabh.roundup;

public class Hdfc implements INotifications{

	@Override
	public void notificationBySms() {
		System.out.println("HDFC-Notificaton By SMS");
		
	}

	@Override
	public void notificationsByEmail() {
		// TODO Auto-generated method stub
		System.out.println("HDFC-Notificaton By Mail");
	}

	@Override
	public void notificationsByCourier() {
		// TODO Auto-generated method stub
		System.out.println("HDFC-Notificaton By Courier");
	}

}
