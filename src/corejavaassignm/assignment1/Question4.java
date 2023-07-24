package corejavaassignm.assignment1;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter mark of subject A: ");
		int a = sc.nextInt();
		System.out.print("Enter mark of subject B: ");
		int b = sc.nextInt();
		System.out.print("Enter mark of subject C: ");
		int c = sc.nextInt();
		
		if(a>=60 && b>=60 && c>=60) {
			System.out.println("Passed😭😭");
		}else if((a>=60 && b>=60 && c<60) || (a>=60 && b<60 && c>=60)
				|| (a<60 && b>=60 && c>=60)) {
			System.out.println("Promoted😶");
		}else {
			System.out.println("Failed😂😂");
		}
		sc.close();
	}

}
