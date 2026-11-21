package com.interfaces;

public class WhatsAppNotificationServiceImple implements NotificationService {

	@Override
	public void send(String message) {
		System.out.println("Whatsapp msg received");

	}

	@Override
	public String getNotificationStatus() {
		return "Whatsapp msg sent successfully";
	}

}
