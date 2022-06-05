import java.io.*;
import java.util.*;
class prg1
{
  static Scanner sc=new Scanner(System.in);
  void m1()
  {
    int n;
    System.out.println("enter the no. of elements");
    n=sc.nextInt();
    int a[][]=new int[n][n];
    System.out.println("enter the elements");
    for(int r=n-1; r>=0; r--)
    {
      for(int c=n-1; c>=0; c--)
      {
         a[r][c]=sc.nextInt();
      }
    }
    for(int r=n-1; r>=0; r--)
    {
      for(int c=n-1; c>=0; c--)
      {
         System.out.print(a[r][c]+ " ");
      }
      System.out.println();
    }
    System.out.println();
    for(int r=n-1; r>=0; r--)
    {
      for(int c=n-1; c>=0; c--)
      {
         if(c<=r)
         System.out.print(a[r][c]+" ");
         else
         System.out.print(" ");
      }
      System.out.println();
    }
  }
  
    public static void main(String args[])
    {
      prg1 ob=new prg1();
      ob.m1();
    }
}
