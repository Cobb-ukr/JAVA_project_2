import java.io.*;
import java.util.*;
class ast2
{
  static Scanner sc=new Scanner(System.in);
  void employeee()
  {
     double basic;
     System.out.println("enter the basic Salary");
     basic=sc.nextInt();
     double da=0.0;
     double hra=0.0;
     double pf=0.0;
     double epf=0.0;
     double cta=0.0;
     double gross=0.0;
     double net=0.0;
     double x=0.0;
     da=0.40* basic;
     hra=0.12*basic;
     pf=0.0833*basic;
     epf=0.0167*basic;
     cta=0.08*basic;
     gross= basic+da+hra+cta;
     x=pf+epf;
     net=gross-x;
     System.out.println("basic salary = " + basic);
     System.out.println(" DA="+ da);
     System.out.println("HRA="+hra);
     System.out.println("PF="+ pf);
     System.out.println("EPF="+ epf);
     System.out.println("CTA="+ cta);
     System.out.println("Gross="+ gross);
     System.out.println("Net="+ net);
  }
  public static void main(String args[])
  {
    ast2 obj=new ast2();
    obj.employeee();
  }
}
     
