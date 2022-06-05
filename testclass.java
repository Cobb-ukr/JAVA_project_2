import java.io.*;
class testclass
{
  static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  void m1()throws IOException
  {
	  int n;
	  int temp=0;
      System.out.println("enter the no. of rows and columns");
      n=Integer.parseInt(br.readLine());
      System.out.println("when you  enter the elements remember to enter them in random order");
      int a[][]=new int[n][n];
      
      for(int r=0; r<n; r++)
      {
		   for(int c=0; c<n; c++)
		   {
			   System.out.println("enter the elements");
			   a[r][c]=Integer.parseInt(br.readLine());
		   }
	   }
	   
	   
	   System.out.println("printing the array");
	   for(int r=0; r<n; r++)
      {
		   for(int c=0; c<n; c++)
		   {
			  System.out.print(a[r][c]+"\t");
		   }
		   System.out.println();
	   }
	   //copying the 2d array into a 1d array for sorting 
	   int ne= n*n;
	   int ar[]=new int [ne];
	   for(int i=0; i<(ne); i++)
	   {
		     for(int r=0; r<n; r++)
         {
		   for(int c=0; c<n; c++)
		   {
			   
			   ar[i]=a[r][c];
			   
		   }
	    }
		    
	   }
	   //sorting in descending order
	   for(int i=0; i<(ne-1); i++)
	   {
		   for(int j=i+1; j<ne; j++)
		   {
		   if(ar[i]<ar[j])
		   {
			   ar[i]=temp;
			   ar[j]=ar[i];
			   temp=ar[j];
		   }
	       }
	       for(int ie=0; ie<(ne); ie++)
	   {
		   System.out.print(a[ie]);
	   }
			  
	   }
	   //re-creating the 2d array with the sorted elements 
	   int x=0;
	   for(int i=0; i<ne; i++)
	   {
		    for(int r=0; r<n; r++)
         {
		   for(int c=0; c<n; c++)
		   {
			   
			   a[r][c]=ar[i];
			   x++;
		   }
	    }
	   }
	   
	   //printing the sorted array
	   
		   System.out.println("printing the sorted array");
	   for(int r=0; r<n; r++)
      {
		   for(int c=0; c<n; c++)
		   {
			  System.out.print(a[r][c]+"\t");
		   }
		   System.out.println();
	   }
		   
}
  public static void main(String args[])throws IOException
  {
   testclass ob=new testclass();
   ob.m1(); 
  }
}
  
      
