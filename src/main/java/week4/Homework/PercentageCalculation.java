package week4.Homework;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PercentageCalculation {
	public static void percentage(String value)
	{
		int totalchar=value.length();
		int uppercase=0;
		int lowercase=0;
		int digits=0;
		int special=0;
		for(int i=0;i<value.length();i++)
		{
			char ch=value.charAt(i);
			if(Character.isUpperCase(ch))
			{
				uppercase++;
			}
			else if(Character.isLowerCase(ch))
			{
				lowercase++;
			}
			else if(Character.isDigit(ch))
			{
				digits++;
			}
			else
			{
				special++;
			}
		}
		double upperper = (uppercase*100)/totalchar;
		double lowerper = (lowercase*100)/totalchar;
		double digitsper = (digits*100)/totalchar;
		double specialper = (special*100)/totalchar;
		
		DecimalFormat format = new DecimalFormat("##.##");
		System.out.println("The upper case : "+format.format(upperper)+" %");
		System.out.println("The lower case : "+format.format(lowerper)+" %");
		System.out.println("The digits case : "+format.format(digitsper)+" %");
		System.out.println("The special case : "+format.format(specialper)+" %");	
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the string input");
		String input =scan.nextLine();
		percentage(input);
		scan.close();
	}
}
