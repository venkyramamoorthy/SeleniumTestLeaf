package week4.Homework;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DuplicateWithoutPrint {
	public static void main(String[] args) {
		int arr1[] = new int[10];
		List<Integer>val = new ArrayList<>();
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter the values in arrays : ");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=Scan.nextInt();
		}
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]==arr1[j])
				{
					val.add(arr1[i]);
				}
			}
		}
		System.out.println("Duplicate Values are : "+val);
	}
}
