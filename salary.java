import java.io.*;
import java.util.*;
class info
{
	String name;
	double sal;
	void accept()
	{
		System.out.println("enter the name of the employee");
		name=sc.nextLine();
		System.out.println("Enter the salary of the employee");
		sal=sc.nextDouble();
	}
	void show()
	{
		System.out.println("Name= "+ name);
		System.out.println("Salary= "+sal);
	}
}
class salary extneds info
{
	double allowance=0.0;
	double total=0.0;
	
	void compute()
	{
		if(sal<20000)
		{
			allowance=0.11*sal;
		}
		else
		allowance=0.0
		
		total= sal+allowance;
	}
	void display()
	{
		System.out.println("Allowance : " +allowance);
		System.out.println("Total salary : "+ total);
	}
	
	public static void main(String args[])
	{
		
	}
}
