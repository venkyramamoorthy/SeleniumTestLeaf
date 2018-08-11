package week3.day1.homework;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number to check leap year or not");
		int year = scan.nextInt();
		/*if((year%4==0 || year%400==0) || (year%400==0||year%100!=0))
		{
			System.out.println("The given : "+year+" is a leap year");
		}*/
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("The entered : "+year+" is a leap year");
				}
				else
				{
					System.out.println("The entered : "+year+" is not a leap year");
				}
			}
			else
			{
				System.out.println("The entered : "+year+" is a leap year");
			}
		}
		else
		{
			System.out.println("The entered : "+year+" is not a leap year");
		}
	}

}
