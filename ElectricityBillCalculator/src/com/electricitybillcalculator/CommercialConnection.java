package com.electricitybillcalculator;

public class CommercialConnection extends Connection {

	public CommercialConnection(int consumerNo, int units) {
		super(consumerNo, units);

	}

//	getEnergyCharge() overridden |
//	| (child) | | getFixedCharge() overridden |
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
	public void printType() {
		// TODO Auto-generated method stub
		super.printType();
	}

}
