import java.util.*;
import java.io.*;
class Bank
{
    static Scanner se=new Scanner(System.in);
    
    String name;
    int accno;
    double p;
    
    Bank(String n, int a, double pr)
    {
       name=n;
       accno=a;
       p=pr;
    }
    
    void display()
    {
        System.out.println("Name= " + name);
        System.out.println("Account number= " + accno);
        System.out.println("Principal= " + p);
    }
    
}

class Account extends Bank
{
   double amt;
   Account(double Amt)
   {
      super("DDDD",1234,50000);
      amt=Amt;
   }
   
   void deposit()
   {
       System.out.println(" Enter the amount you want to deposit");
       p=p+amt;
       
   }
   
   void withdraw()
   {
	   if(amt>p)
	   {
	     System.out.println("Insufficient balance");
	     System.exit(0);
	   }
	   else if(amt<p)
	   {
	     p=p-amt;
	     if(p<500)
	     {
			 System.out.println("Less than minimum balnce. Pay the penalty");
			 p=p-(500-p)/10;
		 }
		 
	   } //end of else if
   }
   
   
   void display()
   {
	   System.out.println("Name= " + name);
       System.out.println("Account number= " +accno);
       System.out.println("Principal= " + p);
   }
   
   
   public static void main(String args[])
   {
	    Account ob=new Account(49600);
	    //ob.deposit();
	    ob.withdraw();
	    ob.display();
   }
}
