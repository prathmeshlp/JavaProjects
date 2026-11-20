package com.armstrongnumber;

public class ArmstrongNumber {

    public static void main(String[] args) {

        int num = 153;
        int original = num;

        int count = 0;
        int sum = 0;

        // Step 1: Count total digits
        int temp = num;

        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        // Step 2: Calculate Armstrong sum
        temp = num;

        while (temp > 0) {

            int digit = temp % 10;

            sum = sum + (int) Math.pow(digit, count);

            temp = temp / 10;
        }

        // Step 3: Compare sum with original number
        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}