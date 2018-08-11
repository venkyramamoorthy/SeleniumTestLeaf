package week3.day1.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RepeatedNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[]=  new int[6];
		System.out.println("Enter your number : ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("your Entered numbers are : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(+a[i]+" , ");
		}
		//sorting default function
		Arrays.sort(a);
		List<Object> value = new ArrayList<Object>();
		System.out.println("  ");
		System.out.println("Duplicate Numbers are : ");
		int i;
		for(i=1;i<a.length;i++)
		{
			if(a[i]==a[i-1])
			{
				if(!value.contains(a[i]))
				{
				value.add(a[i]);
				}
			}
		}
		System.out.println(value);
	}

}
