package week2.day2.weekwork;

import java.util.Scanner;

public class SumofNumbersArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int number[]= new int[6];
	    int temp=0;
	    System.out.println("Enter the numbers in an array : ");
	    for (int i=0;i<number.length;i++)
	    {
	    	number[i]= scan.nextInt();
	    }
	    for (int j=0;j<number.length;j++)
	    {
	    	temp = temp+number[j];
	    }
	    System.out.println("Sum of value is : " + temp);
	}
}
