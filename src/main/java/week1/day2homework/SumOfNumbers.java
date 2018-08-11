package week1.day2homework;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value");
		int number = scan.nextInt();
		int sum =0;
		int remaning;
		while(number > 0)
        {
			remaning = number % 10; // last value
            sum = sum + remaning; // add value
            number = number / 10; // first value
        }
		System.out.println("The sum of the given value is : "+sum);
	}

}
