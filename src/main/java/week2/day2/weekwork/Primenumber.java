package week2.day2.weekwork;

import java.util.Scanner;

public class Primenumber {

	public static void checkprime(int numberOne)
	{
		for (int i = 1; i<=numberOne; i++) {
		   int count = 0;
		   for (int j = 2; j<= i / 2; j++) {
		    if (i % j == 0) {
		     count++;
		     break;
		    }
		   }

		   if (count == 0) {
		    System.out.println(i+" is a prime number");
		   }
		   else {
			   System.out.println(i+" is not a prime number");
		   }

		  }
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the nth number of prime number : ");
		int numberOne = scan.nextInt();
        checkprime(numberOne);
	}

}
