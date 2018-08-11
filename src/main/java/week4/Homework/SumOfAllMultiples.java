package week4.Homework;

public class SumOfAllMultiples {

	public static void main(String[] args) {
		int number=0;
		for(int i=0;i<100;i++)
		{
			if(i%3==0 ||i%5==0)
			{
				number = number +i;
			}
		}
		System.out.println(number);
	}
}
