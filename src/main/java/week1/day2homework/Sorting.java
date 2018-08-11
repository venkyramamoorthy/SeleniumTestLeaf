package week1.day2homework;

public class Sorting {

	public static void main(String[] args) {
		int number[]= {24,32,12,1,60,19,34};
		int temp;
		for(int i=0;i<number.length;i++)
		{
			for(int j=i+1;j<number.length;j++)
			{
				if(number[i]>number[j])
				{
					temp=number[i];
					number[i]=number[j];
					number[j]=temp;
				}
				
			}
			
		}
		System.out.println("Ascending Order is : ");
		for(int i=0;i<number.length;i++)
		{
			System.out.print(number[i]+" , ");
		}
		System.out.println("");
		System.out.println("--------------------");
		for(int i=0;i<number.length;i++)
		{
			for(int j=i+1;j<number.length;j++)
			{
				if(number[i]<number[j])
				{
					temp=number[i];
					number[i]=number[j];
					number[j]=temp;
				}
				
			}
			
		}
		System.out.println("Descending Order is : ");
		for(int i=0;i<number.length;i++)
		{
			System.out.print(number[i]+" , ");
		}
	}

}
