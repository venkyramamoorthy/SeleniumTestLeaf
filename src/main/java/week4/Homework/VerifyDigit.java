package week4.Homework;
import java.util.Scanner;
public class VerifyDigit {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String value = Scan.nextLine();
		if(value.length()==5)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}

		Scan.close();
	}
}