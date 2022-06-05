import java.util.*;
class base1
{
  public int a=5;
  
  public void oride()
  {
     System.out.println("I am the function in base class");
 }
 public void circle()
 {
	  System.out.println("This is the circle method");
  }
}

class Derived1 extends base1
  {
	  int a=15;  //variable in the derived calss will be printed
	  public void square()
	  {
		  System.out.println("This is the method square");
	  }
	  public void oride()
	  {
		  System.out.println("I am the function in derived class");
	  }
	  
	  public static void main(String args[])
	  {
		   Derived1 ob=new Derived1();
		   ob.circle();
		   System.out.println(ob.a);
		   ob.square();
		   ob.oride();
	   }
   }
