package corejavaassignm.assignment1;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter username : ");
		String name = sc.nextLine();
		
		System.out.print("Enter password : ");
		String pass = sc.nextLine();
		
		int count =0;
		while(count<3) {
			System.out.print("Put your name : ");
			String testname = sc.nextLine();
			
			System.out.print("Put your pass : ");
			String testPass = sc.nextLine();
			
			if(testname.equals(name) && testPass.equals(pass)) {
				System.out.println("Welcome");
				break;
			}else {
				System.out.println("try again");
				count++;
			}
		}
		
		if(count==3) {
			System.out.println("Contact to admin");
		}
		sc.close();
	}

}
