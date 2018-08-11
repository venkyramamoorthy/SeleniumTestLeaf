package week1.day2homework;

import java.util.Scanner;
public class LargestOfGivenNumber 
{
    public static void main(String[] args) 
    {
        int number, max;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Total number of elements in the array:");
        number = scan.nextInt();
        int arrayNumber[] = new int[number]; // Memory initialisation
        System.out.println("Enter element values of array:");
        for(int i = 0; i < number; i++)
        {
        	arrayNumber[i] = scan.nextInt();
        }
        max = arrayNumber[0];
        for(int i = 0; i < number; i++)
        {
            if(max < arrayNumber[i])
            {
                max = arrayNumber[i];
            }
        }
        System.out.println("Maximum value:"+max);
    }
}
