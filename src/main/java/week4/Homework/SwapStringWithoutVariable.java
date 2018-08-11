package week4.Homework;
import java.util.Scanner;
public class SwapStringWithoutVariable {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value 1 : ");
		String value1 = scan.nextLine(); // raja
		System.out.println("Enter the value 2 : ");
		String value2 = scan.nextLine(); // raj
		
		System.out.println("Before Swapping : ");
		System.out.println(" "+ value1 + " " + value2);
		
		value1 = value1+value2; // concat the value rajaraj
		value2 = value1.substring(0,value1.length()-value2.length()); // raja
		value1 = value1.substring(value2.length()); //raj
		
		System.out.println("After Swapping : ");
		System.out.println("  "+ value1 + "  " + value2);
		
	}

}
