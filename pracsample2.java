import java.io.*;
import java.util.*;
class pracsample2
{
	static Scanner sc=new Scanner(System.in);
	void m1()
	{
		int sum1=0;
		int mat[][]=new int [4][4];
		System.out.println("Enter the numbers");
		for(int r=0; r<4; r++)
		{
			for(int c=0; c<4; c++)
			{
				mat[r][c]=sc.nextInt();
			}
		}
		
		System.out.println("input matrix is");
		for(int r=0; r<4; r++)
		{
			for(int c=0; c<4; c++)
			{
				System.out.print(mat[r][c]+" ");
			}
			System.out.println();
		}
		
		System.out.println("transpose is");
		for(int r=0; r<4; r++)
		{
			for(int c=0; c<4; c++)
			{
				System.out.print(mat[c][r]+" ");
			}
			System.out.println();
		}
		
		System.out.println("boundary elements:");
		for (int i = 0; i < 4; i++) 
		{
            for (int j = 0; j < 4; j++) 
            {
                if (i == 0)
                    System.out.print(mat[i][j] + " ");
                else if (i == 4 - 1)
                    System.out.print(mat[i][j] + " ");
                else if (j == 0)
                    System.out.print(mat[i][j] + " ");
                else if (j == 4 - 1)
                    System.out.print(mat[i][j] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
        
        

		for (int i = 0; i < 4; i++) 
		{
            for (int j = 0; j < 4; j++) 
            {
                if (i == 0)
                    sum1=sum1+mat[i][j];
                else if (i == 4 - 1)
                   sum1=sum1+mat[i][j];
                else if (j == 0)
                     sum1=sum1+mat[i][j];
                else if (j == 4 - 1)
                     sum1=sum1+mat[i][j];
                
            }

        }
        System.out.println("Sum of boundary elements "+sum1);
		
	}
	
	public static void main(String args[])
	{
		pracsample2 ob=new pracsample2();
		ob.m1();
	}
}
