// This program is to demonstrate the "this" keyword

import java.io.*;
class AA // Base of super
{
  String name;
  long pno;
  AA()
  {
    name="Divya";
    pno=96;
  }
  
  void display()
  {
	//System.out.println("This is also an example of overriding");
    System.out.println(this.name);
    System.out.println(this.pno);
  }
}
  
class BB extends AA //BB is derived or sub class
{
  
  BB()
  {
    super();
  }
  
  public static void main(String args[])
  {
    BB obj1=new BB();
    BB obj2=new BB();
    BB obj=new BB();
    
    obj.display();     // calling the display function before replacing the values of the instance variables with any object means the 
                        // original instance variables gets printed.
    obj1.name="AAA";         // these are new variables created in a new objenct 
    obj1.pno=42;
    obj1.display();
                                // the values of the instance variables gets over written; meaning it gets deleted and replaced.
                                
    obj2.name="BBB";     // this is the second object contaning a different set of vairables
    obj2.pno=50;
    obj2.display();
  }
  
}   
