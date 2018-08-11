package week2.day2.weekwork;

import java.util.Scanner;

public class ArithmeticOperation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberone ;
		int  numbertwo;
		int output;
		String value;
		System.out.println("Enter the number one : ");
		numberone=scan.nextInt();
		System.out.println("Enter the number two : ");
		numbertwo=scan.nextInt();
		// convert the values in integer to string
		scan.nextLine();
		System.out.println("Enter the string value : ");
		value=scan.nextLine();
		switch(value)
		{
		case "add" : 
		case "ADD" : 
			output=numberone+numbertwo;
			System.out.println("Addition value is : "+output);
		    break;
		    
		case "sub": 
		case "SUB" :
		    output=numberone-numbertwo;
			System.out.println("subtraction value is : "+output);
		    break;
		    
		case "mul": 
		case "MUL" :
		    output=numberone*numbertwo;
			System.out.println("Multiplication value is : "+output);
		    break;
		    
		case "div": 
		case "DIV" :
		    output=numberone/numbertwo;
			System.out.println("Division value is : "+output);
		    break;
		default :
			System.out.println("Invalid Input");
		
		}
		
	 }

}
