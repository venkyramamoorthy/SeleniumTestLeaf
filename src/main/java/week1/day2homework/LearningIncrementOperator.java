package week1.day2homework;

import java.util.Scanner;

public class LearningIncrementOperator {

	public static void main(String[] args) {
		int numberOne ;
		int numberTwo ;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Numbers");
		numberOne = scan.nextInt();
		numberTwo = scan.nextInt();
		System.out.println(numberOne++);
		System.out.println(numberOne--);
		System.out.println(++numberTwo);
		System.out.println(--numberTwo);
	}

}
