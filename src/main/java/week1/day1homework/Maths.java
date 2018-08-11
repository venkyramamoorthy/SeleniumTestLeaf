package week1.day1homework;
import java.util.Scanner;
public class Maths {
	
	public void oddOrEvenCheck() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter the number : ");
		int num = scan.nextInt();

		if((num % 2) == 0) 
			System.out.println(num + " is Even number");

		else
			System.out.println(num + " is Odd number");
	}
	public void checkPrime(){ 
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter the number : ");
		int n = scan.nextInt();
		
		int i,m=0,flag=0;      
		m=n/2;      
		if(n==0||n==1){  
			System.out.println(n+" is not prime number");      
		}else{  
			for(i=2;i<=m;i++){      
				if(n%i==0){      
					System.out.println(n+" is not prime number");      
					flag=1;      
					break;      
				}      
			}      
			if(flag==0)  { System.out.println(n+" is prime number"); }  
		}//end of else  
	}  
}