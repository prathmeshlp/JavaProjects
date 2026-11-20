package com.electricitybillcalculator;

public class AgriConnection extends Connection {

	public AgriConnection(int consumerNo, int units) {
		super(consumerNo, units);
		// TODO Auto-generated constructor stub
	}

//	getEnergyCharge() overridden |
//	| (child) | | getFixedCharge() returns 0 |
//	| | | getDutyRate() returns 0 |
//	| | | printType() overridden

	@Override
	public double getEnergyCharge() {
		// TODO Auto-generated method stub
		return super.getEnergyCharge();
	}

	@Override
	public double getFixedCharge() {
		// TODO Auto-generated method stub
		return super.getFixedCharge();
	}

	@Override
	public double getDutyRate() {
		// TODO Auto-generated method stub
		return super.getDutyRate();
	}

	@Override
	public void printType() {
		// TODO Auto-generated method stub
		super.printType();
	}
}
