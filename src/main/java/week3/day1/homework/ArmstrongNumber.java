package week3.day1.homework;

public class ArmstrongNumber {

	public static void main(String[] args) {
		

		for(int i=100;i<=1000;i++)
		{int n,j,k=0;
			n=i;
			int value =String.valueOf(i).length();
			while(n>0)
			{
				j=n%10;
				k=k+(int)(Math.pow(j, value));
				n=n/10;
			}
			if(i==k)
			{
				System.out.println("The number : "+i+" is Armstrong number" );
			}
			
		}
	}
}
