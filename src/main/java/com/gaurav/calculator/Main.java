package com.gaurav.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nScientific Calculator:");
            System.out.println("1. Square root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural logarithm (ln(x))");
            System.out.println("4. Power (x^b)");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number: ");
                    double num = scanner.nextDouble();
                    System.out.println("Result: " + Calculator.sqrt(num));
                    break;
                case 2:
                    System.out.print("Enter number: ");
                    int factNum = scanner.nextInt();
                    System.out.println("Result: " + Calculator.factorial(factNum));
                    break;
                case 3:
                    System.out.print("Enter number: ");
                    double lnNum = scanner.nextDouble();
                    System.out.println("Result: " + Calculator.ln(lnNum));
                    break;
                case 4:
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = scanner.nextDouble();
                    System.out.println("Result: " + Calculator.power(base, exponent));
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option, try again.");
            }
        }
    }
}