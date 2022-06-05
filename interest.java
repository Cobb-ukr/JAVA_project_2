import java.io.*;
import java.util.*;
class interest
{
  static Scanner sc=new Scanner(System.in);
  void inte()
  {
    double p, r, t;
    System.out.println("enter the principal amount");
    System.out.println("enter the rate ");
    System.out.println("enter the time");
    p=sc.nextDouble();
    r=sc.nextDouble();
    t=sc.nextDouble();
    
    double si=0.0;
    si=(p*r*t)/100;
    System.out.println("simple interest ="+si);
    
    double ci=0.0;
    ci=p*(Math.pow((1 + (r/12)),(12*t)));
    System.out.println("the compound interest is "+ ci);
    
    double diff=0.0;
    diff=ci-si;
    System.out.println("the difference between compound interest and simple interest is "+ diff);
    
   } 
   public static void main(String args[])
   {
     interest obj=new interest();
     obj.inte();
   }
}
