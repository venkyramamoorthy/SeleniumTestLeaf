package week1.day2homework;
import java.util.Scanner;
import static java.lang.StrictMath.pow;
public class ReverseFunction {
	public static void reverse(String str)
	{
		if((str==null)|| (str.length()<=1))
		{
			System.out.println(str);
		}else
		{
			System.out.print(str.charAt(str.length()-1));
			reverse(str.substring(0, str.length()-1));
		}
	}
	public static int reversenumber(int number,int count)
	{
		if(count==1)
		{
			return number;
		}
		else
		{

			int returnvalue = number%10;
			number=number/10;
			return (int) ((returnvalue * pow(10,count-1)) + reversenumber(number, --count)); 
		}
	}
	public static void main(String[] args) {
		String str ;
		int number ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to be Reverse");
		str = scan.nextLine();
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println("The Reverse String is(Using String Builder) : "+sb);
		System.out.print("The Reverse String is (Using Recursive function)");
		reverse(str);
		System.out.println("Enter the Number to be reverse");
		number = scan.nextInt();
		int count=0;
		int value=number;
		while(value>0)
		{
			count++;
			value = value/10;
		}
		//System.out.println(count);
		int output =reversenumber(number,count);
		System.out.println("The Reversed Number is : " + output);
	}
}