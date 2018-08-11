package week3.day1.homework;

import java.util.Scanner;

public class ValidPassword {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String Password;
		System.out.println("Please Enter the password");
		Password=scan.nextLine();
		if(Password.matches("^(?=.*[0-9]{2,})(?=.*[A-Z])(?=.*[a-zA-Z]).{10,}$"))
		{
			System.out.println("Valid String for Password");
		}else
		{
			System.out.println("Invalid String for Password");
		}
		scan.close();
	}
}
