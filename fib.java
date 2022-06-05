import java.io.*;
import java.util.*;
class fib
{
   static Scanner sc=new Scanner(System.in);
   
   int fibo(int n)
   {
     if(n==2)
     return 1;
     else if(n==1)
     return 0;
     else
     {
		
       return(fibo(n-2)+fibo(n-1));
     }
   }
   
   public static void main(String args[])
   {
   System.out.println("enter the number");
   int term=sc.nextInt();
   fib ob=new fib();
   int res=ob.fibo(term);
   System.out.println(res);
   }
}
