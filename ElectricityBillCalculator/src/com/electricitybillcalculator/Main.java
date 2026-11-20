
package com.electricitybillcalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Summary variables
        int billCount = 0;
        double totalRevenue = 0;
        double highestBill = -1;
        int highestConsumerNo = -1;

        // Connection-wise counters
        int domesticCount = 0;
        int commercialCount = 0;
        int agriculturalCount = 0;
        int industrialCount = 0;
        


        while (true) {

            System.out.println("\n===== ELECTRICITY BILL CALCULATOR =====");

            System.out.println("1. Domestic Bill");
            System.out.println("2. Commercial Bill");
            System.out.println("3. Agricultural Bill");
            System.out.println("4. Show Summary");
            System.out.println("5. Industrial Bill");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 0) {

                System.out.println(
                    "Thank you for using Electricity Bill Calculator!"
                );

                break;
            }

            if (choice == 4) {

                System.out.println("\n======= BILL SUMMARY =======");

                System.out.println("Total Bills : " + billCount);

                System.out.printf(
                    "Total Revenue : Rs. %.2f%n",
                    totalRevenue
                );

                if (billCount > 0) {

                    System.out.printf(
                        "Highest Bill : Rs. %.2f%n",
                        highestBill
                    );

                    System.out.println(
                        "Highest Consumer No : " + highestConsumerNo
                    );

                } else {

                    System.out.println("No bills generated yet.");
                }

                System.out.println("\n--- CONNECTION-WISE COUNTS ---");

                System.out.println("Domestic Bills : " + domesticCount);
                System.out.println("Commercial Bills : " + commercialCount);
                System.out.println("Agricultural Bills : " + agriculturalCount);
                System.out.println("Industrial Bills : " + industrialCount);

                System.out.println("=============================");

                continue;
            }

            if (choice < 1 || choice > 5) {

                System.out.println("Invalid choice!");
                continue;
            }

            // Consumer number
            System.out.print("Enter consumer number: ");
            int consumerNo = sc.nextInt();

            if (consumerNo <= 0) {
                System.out.println("Consumer number must be greater than zero.");
                continue;
            }

            // Units validation
            System.out.print("Enter units consumed: ");
            int units = sc.nextInt();

            if (units < 0) {
                System.out.println("Units cannot be negative.");
                continue;
            }

            // Parent reference
            Connection connection;

            // Create correct object
            switch (choice) {

                case 1: {

                    System.out.print("Senior citizen? (1 = Yes, 2 = No): ");
                    int seniorChoice = sc.nextInt();

                    boolean seniorCitizen = seniorChoice == 1;

                    connection = new Connection(
                        consumerNo,
                        units,
                        seniorCitizen
                    );

                    domesticCount++;
                    break;
                }

                case 2: {

                    connection = new CommercialConnection(
                        consumerNo, units
                    );

                    commercialCount++;
                    break;
                }

                case 3: {

                    connection = new AgriConnection(
                        consumerNo, units
                    );

                    agriculturalCount++;
                    break;
                }

                case 5: {

                    connection = new IndustrialConnection(
                        consumerNo, units
                    );

                    industrialCount++;
                    break;
                }

                default: {

                    System.out.println("Invalid choice!");
                    continue;
                }
            }

            // Late payment
            System.out.print("Payment late? (1 = Yes, 2 = No): ");
            int paymentChoice = sc.nextInt();

            boolean paidLate = paymentChoice == 1;

            // Generate and display bill
            connection.showBill(paidLate);

            // Get final bill amount
            double billAmount = connection.getTotalBill();

            // Update summary
            billCount++;
            totalRevenue += billAmount;

            if (billAmount > highestBill) {

                highestBill = billAmount;
                highestConsumerNo = connection.getConsumerNo();
            }
        }

        sc.close();
    }
}
