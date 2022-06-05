import java.io.*;
import java.util.*;
class ddim1
{
 static Scanner sc=new Scanner(System.in);
 void m1()
 {
   int a [][]=new int [4][4];
   System.out.println("enter the elements");
   for(int r=0; r<4; r++)
   {
     for(int c=0; c<4; c++)
     {
       a[r][c]=sc.nextInt();
     }
   }
   System.out.println("printing the array");
   for(int r=0; r<4; r++)
   {
     for(int c=0; c<4; c++)
     {
      System.out.print(a[r][c]+ " ");
     }
     System.out.println();
   }
   System.out.println();
   System.out.println("printing left diagonal");
   for(int r=0; r<4; r++)
   {
	    int c=r;
	     System.out.print(a[r][c]+ " ");
   }
   System.out.println();
   System.out.println("printing the right diagonal");
   int ce=3;
   for(int r=0; r<4; r++)
   {
	    System.out.print(a[r][ce]+ " ");
	    ce--;
   }
   
   System.out.println();
   System.out.println("printing the transpose");
   for(int r=0; r<4; r++)
   {
     for(int c=0; c<4; c++)
     {
      System.out.print(a[c][r]+ " ");
     }
     System.out.println();
   }
	    
 }
 public static void main(String args[])
 {
   ddim1 ob=new ddim1();
   ob.m1();
 }
}
