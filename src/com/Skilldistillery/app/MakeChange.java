package com.Skilldistillery.app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {

		Double cost = 0.0;
		Double tendered = 0.0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Hello, what is the price of your item?");
		cost = scanner.nextDouble();

		System.out.println("Thanks!  What is the amount tendered?");
		tendered = scanner.nextDouble();

		double exactChange = tendered - cost;

		while (exactChange == 0) {
			System.out.println("Thank you for using exact change!");
			break;
		}

		if (cost > tendered) {
			System.out.println("Whoops, looks like you did not give me enough money.");
		}

		if (cost < tendered) {
			System.out.println("Your change is: ");
			myMethod(exactChange);

		}
		scanner.close();
	}

	public static void myMethod(double theChange) {

		int change = (int) (theChange * 100);

		int twentyDollarCount = 0;
		if (change > 2000) {
			twentyDollarCount = change / 2000;
			change = change % 2000;
			System.out.print(twentyDollarCount + " twenty dollar bill, ");
		}

		int tenDollarCount = 0;
		if (change > 1000) {
			tenDollarCount = change / 1000;
			change = change % 1000;
			System.out.print(tenDollarCount + " ten dollar bill, ");
		}

		int fiveDollarCount = 0;
		if (change > 500) {
			fiveDollarCount = change / 500;
			change = change % 500;
			System.out.print(fiveDollarCount + " five dollar bill, ");
		}

		int dollarCount = 0;
		if (change > 100) {
			dollarCount = change / 100;
			change = change % 100;
			System.out.print(dollarCount + " dollar bill, ");
		}

		int quarterCount = 0;
		if (change > 25) {
			quarterCount = change / 25;
			change = change % 25;
			System.out.print(quarterCount + " quarter, ");
		}

		int dimeCount = 0;
		if (change > 10) {
			dimeCount = change / 10;
			change = change % 10;
			System.out.print(dimeCount + " dime, ");
		}

		int nickelCount = 0;
		if (change > 5) {
			nickelCount = change / 5;
			change = change % 5;
			System.out.print(nickelCount + " nickel, ");
		}

		int pennyCount = 0;
		if (change >= 1) {
			pennyCount = change / 1;
			change = change % 1;
			System.out.print(pennyCount + " pennies. ");

		}

	}

}
