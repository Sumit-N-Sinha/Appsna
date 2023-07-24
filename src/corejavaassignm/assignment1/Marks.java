package corejavaassignm.assignment1;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stud = 3;
        int subj = 3;
        int[][] marks = new int[3][3];

        // Accept marks for each student and subject
        for (int i = 0; i < stud; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < subj; j++) {
                System.out.print("Subject " + (char) ('A' + j) + ": ");
                marks[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        // Calculate total and average in all subjects
        int[] subjSum = new int[3];
        int sumSubj = 0;

        for (int i=0;i<subj;i++) {
            int subjectSum = 0;
            for (int j=0;j<stud;j++) {
                subjectSum += marks[j][i];
                System.out.println(subjectSum);
            }
            subjSum[i] = subjectSum;
            sumSubj += subjectSum;
        }
        
        System.out.println("Total scored in each subject: ");
        for (int i=0;i<subj;i++) {
            System.out.println("Subject " + (char)('A'+i) + ": " + subjSum[i]);
        }
        System.out.println("Total scored in all subjects: " + sumSubj);

        System.out.println("\nAverage scored in each subject: ");
        for (int i=0;i<subj;i++) {
            System.out.println("Subject " + (char) ('A'+i) + ": " + subjSum[i]/3);
        }

        // Calculate total and average for each student in each respective subject
        int[] studentTotal = new int[3];
        int[] studentAverage = new int[3];

        for (int i = 0; i < stud; i++) {
            int studentSum = 0;
            for (int j = 0; j < subj; j++) {
                studentSum += marks[i][j];
            }
            studentTotal[i] = studentSum;
            studentAverage[i] = studentSum / subj;
        }

        System.out.println("\nTotal scored by each student: ");
        for (int i = 0; i < stud; i++) {
            System.out.println("Student " + (i + 1) + ": " + studentTotal[i]);
        }

        System.out.println("\nAverage scored by each student: ");
        for (int i = 0; i < stud; i++) {
            System.out.println("Student " + (i + 1) + ": " + studentAverage[i]);
        }
		
		sc.close();

	}

}
