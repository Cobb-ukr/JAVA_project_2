import java.io.*;
import java.util.*;
class Function
{
	static Scanner sc=new Scanner(System.in);
	
	int n, r;
	double F;
	Function()
	{
		n=0;
		r=0;
		F=0.0;
	}
	
	void readnum()
	{
		System.out.println("Enter the values of n and e");
		n=sc.nextInt();
		r=sc.nextInt();
	}
	
	int factorial(int d)
	{    
		if (d<=2)    
		return d;    
		else    
		return(d * factorial(d-1));    
	}    
	
	void Show()
	{
	  /*int a= factorial(n);
		int b= factorial(r);
		int c=factorial(n-r);
	  */
		F= factorial(n)/(factorial(r)*(factorial(n-r)));
		
		System.out.println(F);
	}
	
	public static void main(String args[])
	{
		Function ob=new Function();
		ob.readnum();
		ob.Show();
	}
}
