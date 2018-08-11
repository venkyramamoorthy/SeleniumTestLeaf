package week2.day2.weekwork;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Enter the numbers for swapping");
		a=scan.nextInt();
		b=scan.nextInt();
		System.out.println("Before swapping");

		System.out.println("a : "+a);
		System.out.println("b : "+b);

		// logic without using 3rd variable

		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping");
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}

}
