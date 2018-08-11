package week1.day2homework;

import java.util.Scanner;

public class MultiplicationTableUser {

	public static void main(String[] args) {
		int firstNumber;
		int seconfNumber;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first Number");
		firstNumber = scan.nextInt();
		System.out.println("Enter the Last Number");
		seconfNumber = scan.nextInt();
		for (int i=1;i<=seconfNumber;i++)
		{
			System.out.println(i +" * "+firstNumber+" = "+i*firstNumber);

		}	
	}
}
