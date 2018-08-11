package week4.Homework;
import java.util.Scanner;
public class PatternPrint {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number =Scan.nextInt();
		int val = number/2;
		if(!(number%2==0))
		{
			for(int i=1;i<=number;i=i+2) 
			{
				for(int m=1;m<=val;m++) {
				System.out.print(" ");
				}
				val--;
				for(int j=1;j<=i;j++)
				{
					System.out.print(j);
					
				}
				
				System.out.println();
			}
			val=1;
			for(int i=number-2;i>0;i=i-2) 
			{
				for(int m=1;m<=val;m++) {
					System.out.print(" ");
					}
				val++;
				for(int j=1;j<=i;j++)
				{
					
					System.out.print(j);
				}
				
				System.out.println();
			}	
		}
		else
		{
			System.out.println("Even Number Program terminates");
		}
	}
}