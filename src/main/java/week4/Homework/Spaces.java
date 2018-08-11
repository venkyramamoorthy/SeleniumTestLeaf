package week4.Homework;
public class Spaces {
	public static void main(String[] args) {
		String input = " aa        bbbbb         ccc    d  ";
		input=input.trim();
		//System.out.println(input);
		input=input.replaceAll("( )+"," ");
		System.out.println(input);
	}
}
