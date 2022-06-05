import java.io.*;
import java.util.*;
class perimeter
{
	static Scanner sc=new Scanner(System.in);
	
	double a;
	double b;
	perimeter(double x, double y)
	{
		a=x;
		b=y;
	}
	
	double calculate()
	{
		double p=2*(a+b);
		return p;
	}
	
	void show()
	{
		System.out.println("The length is: "+ a);
		System.out.println("The breadth is: "+ b);
		double ans= calculate();
		System.out.println("The perimeter is: "+ans );
	}
	
}
class area extends perimeter
{
	double h;
	double ar;
	
	area(double e, double f)
	{
		super(10,15);
		h=e;
		f=ar;
	}
	
	void doarea()
	{
		ar=b*h;
	}
	
	void show1()
	{
		System.out.println("The height is: "+ h);
		System.out.println("The area is: "+ ar);
	}
	public static void main(String args[])
	{
		area ob=new area(8,0);
		ob.doarea();
		ob.calculate();
		ob.show();
		ob.show1();
	}
}
