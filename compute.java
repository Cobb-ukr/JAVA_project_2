import java.io.*;
import java.util.*;
class library
{
	String name, author;
	double price;
	library(String n, String a, double np)
	{
		name=n;
		author=a;
		price=np;
	}
	void show()
	{
		System.out.println("The Name of the book : " +name);
		System.out.println("The author of the book : "+author);
		System.out.println("The price of the book : "+ price);
	}
}
class compute extends library
{
	int d;
	double r; 
	compute(int dd, double rr)
	{
		super("book name" , " author name" , 200.0);
		d=dd;
		r=rr;
	}
	void fine()
	{
		int delay=d-7;
		if(delay>=1 && delay<=5)
			r= (delay)*2.0;
		else if (delay>=6 && delay<=10)
			r=(5*2.0)+ (delay-5)*3.0;
		else if(delay>10)
			r=(5*2.0)+ (5*3.0)+(delay=10)*5.0;
	}
	void display()
	{
		show();
		System.out.println("NO. of days book retained: "+d);
		System.out.println("Fine payment: "+r);
		System.out.println("Amount to be paid to the library: " +(price*0.02)*d+r);
	}
	public static void main(String args[])
	{
		compute ob=new compute(8, 0.0);
		ob.fine();
		ob.display();
	}
}
