package week3.day1.homework;

import java.util.Scanner;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int number[] = new int[6];
		int largest = number[0];
		int secondlargest = number[0];
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter numbers in an array");
		for(int i=0;i<number.length;i++)
		{
			number[i] =scan.nextInt();
		}
		for(int i=0;i<number.length;i++)
		{
			if(number[i]>largest)
			{
				secondlargest = largest;
				largest = number[i];
			}
			else if(number[i]>secondlargest)
			{
				secondlargest=number[i];
			}
		}
		System.out.println("The Second Largest Number is : " + secondlargest);
	}

}
