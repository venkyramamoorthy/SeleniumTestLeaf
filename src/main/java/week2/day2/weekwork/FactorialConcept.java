package week2.day2.weekwork;

import java.util.Scanner;

public class FactorialConcept {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number for Factorial : ");
		int number= scan.nextInt();
		int output = 1;
		for(int i=1;i<=number;i++)
		{
			output = output*i;
		}
		System.out.println("The Factorial Number is : "+output);
	}

}
