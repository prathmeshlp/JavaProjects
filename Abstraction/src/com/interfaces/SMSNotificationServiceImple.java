package com.interfaces;

public class SMSNotificationServiceImple implements NotificationService {

	@Override
	public void send(String message) {

		System.out.println("SMS recieved" + " " + message);
	}

	@Override
	public String getNotificationStatus() {
		return "EMail sent successfully";
	}

}
