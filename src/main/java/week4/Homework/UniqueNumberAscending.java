package week4.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumberAscending {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the values : ");
		int number = scan.nextInt();
		String value = String.valueOf(number);
		String temp ="";
		for(int i=0;i<value.length();i++)
		{
			char v = value.charAt(i);
			if(temp.indexOf(v)<0)
			{
				temp=temp+v;
			}
		}
		System.out.println(temp + " length : " +temp.length());
		number = Integer.parseInt(temp);
		int [] val = new int[temp.length()];
		int tempi, index=0;
		while (number>0)
		{
			tempi = number%10;
			val[index]=tempi;
			number = number/10;
			index++;
		}
		Arrays.sort(val);
		String output = "";
		for(int i : val){
			//System.out.print(i);
			output = output+String.valueOf(i);
		}
		System.out.println(output);
	}
}
