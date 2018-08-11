package week4.Homework;
import java.util.Scanner;
public class Combination {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Input : ");
		int number = scan.nextInt();
		System.out.println("The Combinations are : ");
		char[] str = Integer.toString(number).toCharArray();
		for(int i=0;i<str.length;i++){
			for(int j=0;j<str.length;j++){
				for(int k=0;k<str.length;k++){
					if(i!=j&&j!=k&&k!=i){
						System.out.println(str[i]+""+str[j]+""+str[k]);
					}
				}
			}
		}
		scan.close();
	}
}
