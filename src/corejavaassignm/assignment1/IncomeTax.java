package corejavaassignm.assignment1;

import java.util.Scanner;

public class IncomeTax {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the taxable amout : ");
        double sal = sc.nextInt();

        if(0<=sal && sal<=180000) {
            System.out.println("No tax for you");
        }
        else if(181000 <= sal && sal <=300000) {
            System.out.println("Tax for you "+ sal/10 );
        } 
        else if(300001 <= sal && sal <=500000) {
            System.out.println("Tax for you "+ sal/5 );
        }
        else if(500001 <= sal && sal <=1000000) {
            System.out.println("Tax for you "+ sal*3/10 );
        }else {
            System.out.println("Out of range");
        }
        sc.close();
    }

 

}