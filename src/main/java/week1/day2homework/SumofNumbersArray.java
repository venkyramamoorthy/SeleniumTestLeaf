package week1.day2homework;

public class SumofNumbersArray {

	public static void main(String[] args) {
		int arr[] = {2,5,6,8,4,8,9};
		int sum = 0;
		int sum1= 0;
		for(int value : arr) {
			sum = sum+value;
		}
		System.out.println("sum of array numbers in for each loop = "+sum);
		for(int i =0;i<arr.length;i++)
		{
			sum1=sum1+arr[i];
		}
		System.out.println("sum of array numbers in for loop = "+sum1);
		
	}

}
