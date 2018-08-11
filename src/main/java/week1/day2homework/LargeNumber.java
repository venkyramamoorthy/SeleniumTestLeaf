package week1.day2homework;

public class LargeNumber {

	public static void main(String[] args) {
		int[] numbers = {22,32,42,-22,-9};
		int max= numbers[0];
		int maximum =0;
		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i]>max)
			{
				max= numbers[i];
			}
		}

		System.out.println("The For Loop Maximum Number is : "+max);

		for(int num : numbers)
		{
			if(num>maximum)
			{
				maximum= num;
			}
		}
		System.out.println("The For Each Loop Maximum Number is : "+maximum);

	}

}
