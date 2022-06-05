import java.io.*;
import java.util.*;
class exp1
{
 static Scanner sc=new Scanner(System.in);
 void ex1()
 {
   int a,b,c;
   System.out.println("enter the value for a,b and c.");
   a=sc.nextInt();
   b=sc.nextInt();
   c=sc.nextInt();
   if(a>0  &&  b>0  && c>0)
   {
     double M=((1/a) + (1/b) + (1/c));
     double N=0.0;
     N=(a/((a+b)) + (b/(b+c)) + (c/(c+a)));
     double P= 0.0;
     P=(M+N);
     System.out.println(M);
     System.out.println(N);
     System.out.println(P);
   }
   else 
   {
	    System.out.println("enter values greater than 0");
   }
   
  }
  public static void main(String args[])
  {
	   exp1 obj=new exp1();
	   obj.ex1();
  }
}
