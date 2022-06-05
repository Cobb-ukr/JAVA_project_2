import java.io.*; // pg 512 
import java.util.*;
class Number
{
    int n;
    Number(int nn)
    {
		n=nn;
	}
	int factorial(int a)
	{
		int f=1;
		for(int i=1; i<=a; i++)
		{
			f=f*i;
		}
		return f;
	}
	
	void display1()
	{
		System.out.println(n); // this is to show overriding. 
	}
} 

class Series extends Number
{
    double sum;
    Series(int s)
    {
		super(5);
		 sum=s;
	 }
	 void calcsum()
	 {
		 for(int i=1; i<=super.n; i++)
		 {
			 sum=sum+factorial(i);
			 
		 }
	 }
	 void display()
	 {
		 System.out.println(" the sum is " +sum);
	 }
	 
	 public static void main(String args[])
	 {
		 Series ob=new Series(0);
		 ob.calcsum();
		 //ob.display1();
		 ob.display();
	 }
 }
		 
		 
   
