package week2.day2.weekwork;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to check palindrome or not");
		String str1 = scan.nextLine();
		String str2="";
		int size =str1.length();
		for(int i=size-1;i>=0;i--)
		{
			str2=str2+str1.charAt(i);
		}
		System.out.println("The Reverse String is : "+str2);
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("The given String is palindrome");
		}else
		{
			System.out.println("The given String is not a palindrome");
		}
	}

}
