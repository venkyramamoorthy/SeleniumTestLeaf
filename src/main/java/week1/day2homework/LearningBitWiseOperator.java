package week1.day2homework;

import java.util.Scanner;

public class LearningBitWiseOperator {

	public static void main(String[] args) {
		int numberOne ;
		int numberTwo ;
		int numberThree;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Numbers");
		numberOne = scan.nextInt();
		numberTwo = scan.nextInt();

		numberThree = numberOne & numberTwo;     
		System.out.println("numberOne & numberTwo = " +numberThree);

		numberThree = numberOne | numberTwo;        
		System.out.println("numberOne | numberTwo = " +numberThree);

		numberThree = numberOne ^ numberTwo;       
		System.out.println("numberOne ^ numberTwo = " +numberThree);

		numberThree = ~numberOne;           
		System.out.println("~numberOne = " +numberThree);

		numberThree = numberOne << 2;      
		System.out.println("numberOne << 2 = " +numberThree);

		numberThree = numberOne >> 2;     
		System.out.println("numberOne >> 2  = " +numberThree);

		numberThree = numberOne >>> 2;      
		System.out.println("numberOne >>> 2 = " +numberThree);
	}

}
