package com.smartHomeCondiStatements;

public class SmartHome {

	int temperature;
	int lightLevel;
	int time;

	// Temperature Control
	public void checkTemperature() {

		if (temperature >= 35) {
			System.out.println("AC ON");
		} else if (temperature >= 25) {
			System.out.println("Fan ON");
		} else {
			System.out.println("Cooling OFF");
		}
	}

	// Light Control
	public void checkLight() {

		if (lightLevel <= 3) {
			System.out.println("Lights ON");
		} else {
			System.out.println("Lights OFF");
		}
	}

	// Time-Based Mode
	public void checkTime() {

		if (time >= 6 && time <= 11) {
			System.out.println("Morning Mode Activated");
		} else if (time >= 12 && time <= 17) {
			System.out.println("Afternoon Mode Activated");
		} else if (time >= 18 && time <= 21) {
			System.out.println("Evening Mode Activated");
		} else {
			System.out.println("Night Mode Activated");
		}
	}

	// Door Lock Control
	public void checkDoorLock() {

		if ((time >= 22 && time <= 23) || (time >= 0 && time <= 5)) {

			System.out.println("Door Locked (Night Security ON)");
		} else {
			System.out.println("Door Unlocked (Day Mode)");
		}
	}

	// Run All Smart Home Functions
	public void runSystem() {

		checkTemperature();
		checkLight();
		checkTime();
		checkDoorLock();
	}

}
