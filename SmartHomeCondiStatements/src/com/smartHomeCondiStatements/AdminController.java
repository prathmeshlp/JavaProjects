package com.smartHomeCondiStatements;

public class AdminController {

	public static void main(String[] args) {

		SmartHome smartHome = new SmartHome();
		smartHome.temperature = 30;
		smartHome.lightLevel = 2;
		smartHome.time = 19;

		// Run the Smart Home System
		smartHome.runSystem();

	}

}
