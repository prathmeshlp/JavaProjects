
package com.electricitybillcalculator;

public class IndustrialConnection extends Connection {

    // Constructor
    public IndustrialConnection(int consumerNo, int units) {

        super(consumerNo, units);
    }

    // Override energy charge
    @Override
    public double getEnergyCharge() {

        int units = getUnits();

        double charge;

        if (units <= 500) {

            charge = units * 6;

        } else if (units <= 1000) {

            charge = (500 * 6) + ((units - 500) * 8);

        } else {

            charge = (500 * 6) +
                     (500 * 8) +
                     ((units - 1000) * 12);
        }

        return charge;
    }

    // Override fixed charge
    @Override
    public double getFixedCharge() {

        return 300;
    }

    // Override connection type
    @Override
    public void printType() {

        System.out.println("Industrial");
    }
}
