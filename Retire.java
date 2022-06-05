import java.io.*;
import java.util.*;
class Personal
{
   static Scanner sc=new Scanner(System.in);
   String name;
   int Pan;
   double basic_pay;
   int acc_no;
   
   Personal(String n, int p, double b, int ac)
   {
       name=n;
       Pan=p;
       basic_pay=b;
       acc_no=ac;
   }
   
   void display()
   {
       System.out.println("Employee name= " + name);
       System.out.println("Pan number= "+ Pan);
       System.out.println("Basic pay= "+ basic_pay);
       System.out.println("Account number= "+ acc_no);
   }
}

class Retire extends Personal
{
  int Yrs;
  double Pf;
  double Grat;
  
  Retire(int y, double pf, double gr)
  {
	  
	  super("name1",1234,10000.00,5678); 
     Yrs=y;
     Pf=pf;
     Grat=gr;
  }
  
  void provident()
  {
	  Pf=((2.0/100.0)*basic_pay)*Yrs;
  }
  
  void gratuity()
  {
	    if(Yrs>=10)
	    {
		   Grat= basic_pay*12;
	    }
	    else
	    Grat=0;
  }
  
  void display1()
  {
	   System.out.println("Employee name= " + name);
       System.out.println("Pan number= "+ Pan);
       System.out.println("Basic pay= "+ basic_pay);
       System.out.println("Account number= "+ acc_no); 
       
       System.out.println("Provident Fund= "+ Pf);
       System.out.println("Gratuity= "+Grat);
   }
   
   public static void main(String args[])
   {
	   Retire ob=new Retire(11,0.0,0.0);
	   ob.provident();
	   ob.gratuity();
	   ob.display1();
   }
}
