import java.io.*;
import java.util.*;
class employee
{
  static Scanner sc=new Scanner(System.in);
  
	String empname;
    int empcode;
    double basicpay;
    double h,d,sp,sal,tsal;
   void employee()
  {
    empname="";
     empcode=0;
     basicpay=0;
  }
  
   void employee(String n, int p, double q)
  {
	  empname=n;
	  empcode=p;
	  basicpay=q;
	  
  }
  double salarycal()
  {
	  double sa=0;
	h=0.3*basicpay;
	d=0.4*basicpay;
	sal=basicpay+h+d;
	if(empcode<=15)
	{
		if(sal<=15000)
		{
			sa=0.2*sal;
		}
		else
		sa=1000;
	}
	if(sal<=2500)
	{
		tsal=2500+sal;
	}
	else
	{
	tsal=sa+sal;
	}
	return tsal;
 }
 
	  
  
  public static void main(String args[])
  {
  employee ob=new employee();
  System.out.println("enter the employee name");
  String en=sc.nextLine();
  System.out.println("enter the employee code");
  int ecode=sc.nextInt();
  System.out.println("Enter the basic pay");
  double bp=sc.nextDouble();
  
  ob.employee();
  ob.employee( en,ecode,bp);
  double ans= ob.salarycal();
  System.out.println("the totalpay is ="+ans);
  }
}
    
