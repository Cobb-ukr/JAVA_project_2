import java.io.*;
import java.util.*;
class ast1
{
  static Scanner sc=new Scanner(System.in);
  void m1()
  {
     float x;
     System.out.println("enter a value for x");
     x=sc.nextFloat();
     double fx=0.0;
     if(x>= -3 && x<= -1)
       fx=(x+2)/(2*x+1);
     else if(x==0)
       fx=(2*x -1)/(x+1);
     else if(x>=1 && x<=3)
       fx=(2*x +1)/(2*x -1);
     
     System.out.println("f(x) =" +fx);
  }
  public static void main(String args[])
  {
    ast1 obj=new ast1();
    obj.m1();
  }
}
