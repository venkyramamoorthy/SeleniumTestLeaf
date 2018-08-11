package week1.day2homework;

import java.util.Scanner;

public class LearningArithmetic {

	public static void addition(int numberOne , int numberTwo)
	{
		int add = numberOne + numberTwo;
		System.out.println("Addition = "+add);
	}

	public static void subtraction(int numberOne , int numberTwo)
	{
		int sub = numberOne - numberTwo;
		System.out.println("Subtraction = "+sub);
	}
	public static void multiply(int numberOne , int numberTwo)
	{
		int mul = numberOne * numberTwo;
		System.out.println("Multiply = "+mul);
	}
	public static void division(int numberOne , int numberTwo)
	{
		int div = numberOne / numberTwo;
		System.out.println("Division = "+div);
	}
	public static void modulo(int numberOne , int numberTwo)
	{
		int mod = numberOne % numberTwo;
		System.out.println("Division = "+mod);
	}

	public static void main(String[] args) {
		int numberOne ;
		int numberTwo ;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Numbers");
		numberOne = scan.nextInt();
		numberTwo = scan.nextInt();
		addition(numberOne,numberTwo);
		subtraction(numberOne,numberTwo);
		multiply(numberOne,numberTwo);
		division(numberOne,numberTwo);
		modulo(numberOne,numberTwo);

	}
}
