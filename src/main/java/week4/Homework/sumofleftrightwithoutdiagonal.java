package week4.Homework;

import java.util.Scanner;
public class sumofleftrightwithoutdiagonal
{
  public static void main (String[]args)
  {
    // Input the matrix
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the size of the square matrix:");
    int size = input.nextInt(), ltemp =0, lsum =0 ,rsum=0,rtemp=0;
    int [][]a = new int [size][size];
     for (int i=0; i<size; i++)
    {
      for (int j=0; j<size;j++)
      {
        a[i][j] = input.nextInt();
      }
    }
     
     for (int i=0; i<size; i++)
     {
       for (int j=0; j<size;j++)
       {
         System.out.print(a[i][j]+" ");
       }
       System.out.println();
     } 
     // Calculate the sum of the left and right diagonals
    for (int i=size-2; i>0; i--)
    {
      for (int j=0; j<=1;j++)
      {
        lsum=lsum+a[ltemp][j];
        	
      }
      ltemp++;
    }
    
    System.out.println("Left sum : = "+lsum);
    
    for (int i=size-1; i>0; i--)
    {
      for (int j=size-1; j>=i;j--)
      {
    	  rsum=rsum+a[rtemp][j];
      }
      rtemp++;
    }
  
    System.out.println ("Right Sum= "+rsum);                    
  }
}