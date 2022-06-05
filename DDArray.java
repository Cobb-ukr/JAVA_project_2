import java.io.*;
import java.util.*;
class DDArray
{
 static Scanner sc=new Scanner(System.in);
 
 int m,n;
 int mat[][]=new int[m][n];
 void DDArray(int nr, int nc)
 {
	 m=nr;
	 n=nc;
 }
 void readmatrix()
 {
	 System.out.println("enter the elements");
	 int mat[][]=new int[m][n];
	 for (int i = 0; i < m; i++) 
	 {
      for (int j = 0; j < n; j++) 
      {
        mat[i][j] = sc.nextInt();
      }
    }
    
 }
 
 void Sums()
	{
		int sum=0;
		for(int r=0; r<m; r++)
		{
			for(int c=0; c<n; c++)
			{
				if(r==c)
				{
					sum=sum+ mat[r][c];
				}
	            if(r==c)
				{
					System.out.print(mat[r][c]+" ");
					System.out.println();
				}    		
			}
			
	}
	System.out.println(sum);
	
	
	
	   int sum2=0;
		for(int r=m; r>=0; r--)
		{
			for(int c=n; c>=0; c--)
			{
				if(r==c)
				{
					sum2=sum2+ mat[r][c];
				}
	            if(r==c)
				{
					System.out.print(mat[r][c]+" ");
					System.out.println();
				}    		
			}
			
	}
	
	   System.out.println(sum2);
	   
	  
	   
	}
	
 
 void Show_Mats()
 {
	 int mat[][]=new int[m][n];
	for(int i=0; i<m; i++)
	 {
		 for(int j=0; j<n; j++)
		 {
			 System.out.print(mat[i][j]+" ");
		 }
		 System.out.println();
	 } 
 }
 
 
 
 public static void main(String args[])
 {
	 DDArray ob=new DDArray();
	 int a,b;
	 System.out.println("enter the number of rows and columns");
	 a=sc.nextInt();
	 b=sc.nextInt();
	 ob.DDArray(a,b);
	 ob.readmatrix();
	 ob.Sums();
	 ob.Show_Mats();
 }
}
