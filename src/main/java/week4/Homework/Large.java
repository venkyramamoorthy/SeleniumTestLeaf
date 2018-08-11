package week4.Homework;

import java.util.Scanner;

public class Large {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scan.nextInt();
		System.out.println("Enter the digit : ");
		int digit = scan.nextInt();
		
		char c = Integer.toString(digit).charAt(0);
		for(int i=number;i>0;--i)
		{
			if(Integer.toString(i).indexOf(c)==-1)
			{
				System.out.println("The value is : "+ i);
				break;
			}
			
		}
		if(number==1)
		{
			System.out.println("The value is : -1");
		}
		scan.close();
	}

}
