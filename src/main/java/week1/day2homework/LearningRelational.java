package week1.day2homework;

import java.util.Scanner;

public class LearningRelational {
	public static void greater(int numberOne, int numberTwo) {
		if(numberOne>numberTwo)
		{
			System.out.println("The Greater Number is : "+numberOne);
		}
		else 
		{
			System.out.println("The Greater Number is : "+numberTwo);
		}

	}
	public static void lesser(int numberOne, int numberTwo) {
		if(numberOne<numberTwo)
		{
			System.out.println("The Lesser Number is : "+numberOne);
		}
		else 
		{
			System.out.println("The Lesser Number is : "+numberTwo);
		}	
	}
	public static void greaterOrEqual(int numberOne, int numberTwo) {
		if(numberOne>=numberTwo)
		{
			System.out.println("The Greater or Equal Number is : "+numberOne);
		}
		else 
		{
			System.out.println("The Greate or Equal Number is : "+numberTwo);
		}	

	}
	public static void lesserOrEqual(int numberOne, int numberTwo) {
		if(numberOne<=numberTwo)
		{
			System.out.println("The Lesser or Equal Number is : "+numberOne);
		}
		else 
		{
			System.out.println("The Lesser or Equal Number is : "+numberTwo);
		}	

	}
	public static void notEqual(int numberOne, int numberTwo) {
		if(numberOne!=numberTwo)
		{
			System.out.println("Both are not Equal");
		}
		else 
		{
			System.out.println("Both are Equal ");
		}	
	}
	public static void equalEqual(int numberOne, int numberTwo) {
		if(numberOne==numberTwo)
		{
			System.out.println("Both are Equal");
		}
		else 
		{
			System.out.println("Both are not Equal ");
		}	

	}
	public static void main(String[] args) {
		int numberOne ;
		int numberTwo ;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Numbers");
		numberOne = scan.nextInt();
		numberTwo = scan.nextInt();
		greater(numberOne,numberTwo);
		lesser(numberOne,numberTwo);
		greaterOrEqual(numberOne,numberTwo);
		lesserOrEqual(numberOne,numberTwo);
		notEqual(numberOne,numberTwo);
		equalEqual(numberOne,numberTwo);
	}

}
