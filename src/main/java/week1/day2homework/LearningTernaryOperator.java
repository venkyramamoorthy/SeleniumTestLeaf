package week1.day2homework;

import java.util.Scanner;

public class LearningTernaryOperator {

	public static void main(String[] args) {
		int numberOne ;
		int numberTwo ;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the 2 Numbers");
		numberOne = scan.nextInt();
		numberTwo = scan.nextInt();
		System.out.println("The greatest number is ");
		int resultSet=(numberOne>numberTwo)?numberOne:numberTwo;
		System.out.println(resultSet);
	}

}
