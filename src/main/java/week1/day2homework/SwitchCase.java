package week1.day2homework;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Enter the Result value");
			char result = scan.next().charAt(0);
			switch(result)
			{
			case 'P':
			case 'p':
				System.out.println("The Result values is PASSED");
				break;	
			case 'F'  :
			case 'f'  :
				System.out.println("The Result values is FAILED");
				break;	
			case 'B'  :
			case 'b'  :
				System.out.println("The Result values is BLOCKED");
				break;
			default  :
				System.out.println("The Result values is Invald");
			}
		}
	}

}
