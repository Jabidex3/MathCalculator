package com.jabid;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CalculatorRunner {

	public static double addNums(String s) {
		
		String[] operands = s.split("\\+");
		ArrayList<Double> convertedOperands = new ArrayList<Double>();
		for (String str : operands) {
			convertedOperands.add(Double.valueOf(str));
		}
		double total = 0;
		for(Double d: convertedOperands) {
			total+=d;
		}
		return total;
	}
	
	public static double subtractNums(String s) {
		String[] operands = s.split("-");
		ArrayList<Double> convertedOperands = new ArrayList<Double>();
		for (String str : operands) {
			convertedOperands.add(Double.valueOf(str));
		}
		double total = convertedOperands.get(0);
		for(int i =1; i< convertedOperands.size();i++) {
			total-=convertedOperands.get(i);
		}
		return total;
	}
	
	public static double multiplyNums(String s) {
		String[] operands = s.split("\\*");
		ArrayList<Double> convertedOperands = new ArrayList<Double>();
		for (String str : operands) {
			convertedOperands.add(Double.valueOf(str));
		}
		double total = 1;
		for(Double d: convertedOperands) {
			total*=d;
		}
		return total;
	}
	
	public static double divideNums(String s) {
		String[] operands = s.split("/");
		ArrayList<Double> convertedOperands = new ArrayList<Double>();
		for (String str : operands) {
			convertedOperands.add(Double.valueOf(str));
		}
		
		double total = convertedOperands.get(0);
		for(int i =1; i< convertedOperands.size();i++) {
			total/=convertedOperands.get(i);
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Welcome to the Simple Math Calculator!****");
		
		Scanner scan = new Scanner(System.in);
		boolean continueCalc = true;
		while(continueCalc) {
			System.out.println("Press 1 - for Addition");
			System.out.println("Press 2 - for Subtraction");
			System.out.println("Press 3 - for Multiplication");
			System.out.println("Press 4 - for Division");
			System.out.println("Press 5 - To Exit");
			System.out.println("-----------------------------------------");
			String choice = scan.nextLine();
			String expressionGiven = "";
			double sol = 0;
			switch(choice){
			case "1":
				System.out.println("Enter the calculation you wish to solve:");
				expressionGiven = scan.nextLine();
				
				if(expressionGiven.length()<3) {
					System.out.println("You have entered an invalid calculation!");
				}
				else {
					sol = addNums(expressionGiven);
					System.out.println(sol);
				}
				break;
			case "2":
				System.out.println("Enter the calculation you wish to solve:");
				expressionGiven = scan.nextLine();
				if(expressionGiven.length()<3) {
					System.out.println("You have entered an invalid calculation!");
				}
				else {
					sol = subtractNums(expressionGiven);
					System.out.println(sol);	
				}
				break;
			case "3":
				System.out.println("Enter the calculation you wish to solve:");
				expressionGiven = scan.nextLine();
				if(expressionGiven.length()<3) {
					System.out.println("You have entered an invalid calculation!");
				}
				else {
				sol = multiplyNums(expressionGiven);
				System.out.println(sol);
				}
				break;
			case "4":
				System.out.println("Enter the calculation you wish to solve:");
				expressionGiven = scan.nextLine();
				if(expressionGiven.length()<3) {
					System.out.println("You have entered an invalid calculation!");
				}
				else {
				sol = divideNums(expressionGiven);
				System.out.println(sol);
				}
				break;
			case "5":
				System.out.println("Thank you for using the Simple Math Calculator! Goodbye!");
				continueCalc = false;
				break;
			default:
				System.out.println("You have entered a choice that is invalid!");
			}
				
		}
	}

}
