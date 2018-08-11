package week2.day2.weekwork;

import java.util.Scanner;

public class CodingChallengeNumbersDivisible {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Numbers");
		int value1 = scan.nextInt();
		int value2 = scan.nextInt();
		for(int i=value1;i<=value2;i++)
		{
			String result1="FIZZ";
			String result2="BUZZ";
			String result3="FIZZBUZZ";

			if(i%3==0&&i%5==0)
			{
				System.out.print(result3+" ");
			}
			else if(i%3==0)
			{
				System.out.print(result1+" ");
			}
			else if(i%5==0)
			{
				System.out.print(result2+" ");

			}	
			else if(!(i%3==0&&i%5==0))
			{
				System.out.print(i+" ");
			}
		 
		}

	}

}
