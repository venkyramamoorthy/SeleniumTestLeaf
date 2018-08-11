package week4.Homework;
import java.util.Scanner;
public class UniqueCharacters {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input String");
        String input = scan.nextLine();
        System.out.println("Output strings are ");
    	String temp=" ";
        for(int i=0;i<input.length();i++)
        {
        	char value = input.charAt(i);
        	if(temp.indexOf(value)<0)
        	{
        		temp=temp+value;
        	}
        }
        System.out.println(temp +" ");
	}

}
