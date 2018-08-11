package week4.Homework;
import java.util.Scanner;
public class PerfectNumbers {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the number for checking the perfect number : ");
		int value =Scan.nextInt();
		int temp=0;
		for(int i=1;i<value;i++)
		{
			if(value%i==0)
			{
				temp=temp+i;
			}
		}
		//System.out.println(temp);
		if((value==temp)&&((value+temp)/2==value))
		{
			System.out.println(value+" : Perfect Number");
		}
		else
		{
			System.out.println(value+" : Not a Perfect Number");
		}
	}
}