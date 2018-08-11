package week1.day2class;

import java.util.Scanner;

public class LearningArrays {

	public static void main(String[] args) {
		int totalNumberOfstudents=5;
		totalNumberOfstudents = totalNumberOfstudents -1;
		String[] studentsName = {"Venkateshraja","Arockia","Gugapriya","Shanmugalakshmi","Suganya"};
		int[] studentsAge = {24,27,26,25,25};
		char[][] grades = {{'A','B','C','D','E'},{'A','A','B','D','E'},{'A','B','C','E','E'},{'A','B','C','E','E'},{'A','B','C','E','E'}};
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<=totalNumberOfstudents;i++)
		{
			System.out.println("\nEnter the Students details you need to print : ");
			int studentNumber = scan.nextInt();
			//Logic for printing
			studentNumber = studentNumber -1;
			System.out.println(studentsName[studentNumber]+" who is "+studentsAge[studentNumber]+" Years old scored "+grades[studentNumber][0]
					+","+grades[studentNumber][1]+","+grades[studentNumber][2]+","+grades[studentNumber][3]+","+grades[studentNumber][4]);
		}

	}

}
