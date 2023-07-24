package corejavaassignm.assignment1;

import java.util.Scanner;

public class SimpleCompound {

	public static void main(String args[]) {    
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount: ");
		double principleAmount = sc.nextDouble();
		System.out.println("Enter the no.of years: ");
		int year = sc.nextInt();
		System.out.println("Enter the rate of interest: ");
		double rate = sc.nextDouble();

		double simpleInt=(principleAmount*year*rate)/100;
		double compiInt=principleAmount*Math.pow(1+rate/100, rate)-principleAmount;
		System.out.println("Simple Interest : "+simpleInt);
		System.out.println("Compound Interest : "+compiInt);
		sc.close();
	}

}
