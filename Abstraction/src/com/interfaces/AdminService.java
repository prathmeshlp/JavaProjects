package com.interfaces;

public class AdminService {

	public static void main(String[] args) {

		NotificationService notificationService;

		System.out.println("===Email===");
		notificationService = new EmailNotificationServiceImple();// Indirect Object--loose coupling

//		EmailNotificationServiceImple emailNotificationServiceImple = new EmailNotificationServiceImple();// direct
		// object-tight
		// coupling

		notificationService.send("Your Order is placed!!");
		System.out.println(notificationService.getNotificationStatus());

		System.out.println("===SMS===");

		notificationService = new SMSNotificationServiceImple();
		notificationService.send("SMS sent Successfully");
		System.out.println(notificationService.getNotificationStatus());

		System.out.println("===Whatsapp===");
		notificationService = new WhatsAppNotificationServiceImple();
		notificationService.send("Your order has been shipped");
		System.out.println(notificationService.getNotificationStatus());

	}

}
