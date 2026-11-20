package com.electricitybillcalculator;

public class Connection {

	// Private fields
	private int consumerNo;
	private int units;
	private boolean seniorCitizen;

	// Calculated bill fields
	private double energyCharge;
	private double fixedCharge;
	private double duty;
	private double fine;
	private double totalBill;
	private double discount;

	// Constructor
	public Connection(int consumerNo, int units) {
		this(consumerNo, units, false);
	}

	// Constructor with senior citizen option
	public Connection(int consumerNo, int units, boolean seniorCitizen) {

		this.consumerNo = consumerNo;
		this.units = units;
		this.seniorCitizen = seniorCitizen;
	}

	public int getConsumerNo() {
		return this.consumerNo;

	}

	public int getUnits() {
		return this.units;
	}

	public double getEnergyCharge() {

		double charge;

		if (units <= 100) {
			charge = units * 3;

		} else if (units <= 300) {
			charge = (100 * 3) + ((units - 100) * 5);

		} else {
			charge = (100 * 3) + (200 * 5) + ((units - 300) * 8);
		}

		return charge;
	}

	// Fixed charge
	public double getFixedCharge() {
		return 50;
	}

	// Duty rate
	public double getDutyRate() {
		return 0.05;
	}

	public double getDuty() {
		return (energyCharge + fixedCharge) * getDutyRate();
	}

	// Calculate complete bill
	public double calculateBill(boolean paidLate) {

		// Calculate energy charge
		double originalEnergyCharge = getEnergyCharge();

		// Senior citizen rebate
		discount = 0;

		if (isSeniorCitizen()) {
			discount = originalEnergyCharge * 0.10;
		}

		energyCharge = originalEnergyCharge - discount;

		// Fixed charge
		fixedCharge = getFixedCharge();

		// Electricity duty
		duty = (energyCharge + fixedCharge) * getDutyRate();

		// Amount after duty
		double amountAfterDuty = energyCharge + fixedCharge + duty;

		// Late payment fine
		if (paidLate) {
			fine = amountAfterDuty * 0.02;
		} else {
			fine = 0;
		}

		// Final bill
		totalBill = amountAfterDuty + fine;

		return totalBill;
	}

	// Print connection type
	public void printType() {
		System.out.println("Domestic");
	}

	// Display bill
	public void showBill(boolean paidLate) {

		calculateBill(paidLate);

		System.out.println("\n========= ELECTRICITY BILL =========");

		System.out.println("Consumer No : " + consumerNo);

		System.out.print("Connection : ");
		printType();

		System.out.println("Units Used : " + units);

		System.out.println("------------------------------------");

		System.out.printf("Energy Charge : %.2f%n", energyCharge);

		if (discount > 0) {
			System.out.printf("Senior Rebate : -%.2f%n", discount);
		}

		System.out.printf("Fixed Charge : %.2f%n", fixedCharge);

		System.out.printf("Duty (%.0f%%) : %.2f%n", getDutyRate() * 100, duty);

		System.out.printf("Late Fine : %.2f%n", fine);

		System.out.println("------------------------------------");

		System.out.printf("Total Bill : %.2f%n", totalBill);

		System.out.println("====================================");
	}

	public boolean isSeniorCitizen() {
		return this.seniorCitizen;
	}

	public double getTotalBill() {
		return totalBill;
	}

}
