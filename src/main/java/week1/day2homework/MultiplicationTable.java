package week1.day2homework;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		int total=10;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter which Multiplication table you need to print");
		int number=scan.nextInt();
		System.out.println("Multiplication table \n");
		for(int start=1;start<=total;start++)
		{
			System.out.println(start+" * "+number+" = "+ start*number);
		}

	}

}
