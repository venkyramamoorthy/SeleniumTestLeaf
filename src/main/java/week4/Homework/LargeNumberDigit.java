package week4.Homework;

import java.util.Scanner;

public class LargeNumberDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scan.nextInt();
		System.out.println("Enter the digit : ");
		int digit = scan.nextInt();
		number--;
		while(Integer.toString(number).contains(Integer.toString(digit)))
		{
			number--;
		}
		System.out.println("Largest Number is : " + number);
		scan.close();
	}
}