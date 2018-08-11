package week4.Homework;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row , column,rowstart = 0,colstart = 0;
		int matrix[][] ;
		System.out.println("Enter the row values");
		row = scan.nextInt();
		System.out.println("Enter the column values");
		column=scan.nextInt();
		matrix = new int[row][column];
		
		System.out.println("Enter the values to be printed in matrix format");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				matrix[i][j]=scan.nextInt();
			}
		}
		System.out.println("The output matrix is ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print("\t"+matrix[i][j]);
			}
			System.out.println();
		}
		
		while(rowstart<row && colstart<column)
		{
			for(int i=0;i<row;i++)
			{
				System.out.print(matrix[rowstart][i]+" ");
			}
			rowstart++;
			for(int i=rowstart;i<row;i++)
			{
				System.out.print(matrix[i][column-1]+" ");
			}
			column--;
			if(rowstart<row)
			{
				for(int i=column-1;i>=colstart;i--)
				{
					System.out.print(matrix[row-1][i]+" ");
				}
				row--;
			}
			if(colstart<column)
			{
				for(int i=row-1;i>rowstart;i--)
				{
					System.out.print(matrix[i][colstart]+" ");
				}
				colstart++;
			}	
		}	
	}
}