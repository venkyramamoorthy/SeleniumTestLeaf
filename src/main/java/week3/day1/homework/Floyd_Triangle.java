package week3.day1.homework;

import java.util.Scanner;

public class Floyd_Triangle {

	public static void main(String[] args) {
		int value,num=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Floyd triangle value");
		value=scan.nextInt();
		for(int i=1;i<=value;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num);
				num++;
			}
			System.out.println();
		}

	}

}
