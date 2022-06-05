import java.io.*;
import java.util.*;
class testfact
{
 static Scanner sc=new Scanner(System.in);
 int Fact(int n)
 {
   if(n==1)
   return 1;
   else 
   return n*Fact(n-1);
 }
  public static void main(String args[])
  {
   int num;
   System.out.println("enter the number ");
   num=sc.nextInt();
   testfact ob=new testfact();
   int result=ob.Fact(num);
   System.out.println("factorial ="+ result);
  }
}
