import java.io.*;
import java.util.*;
class D2Point
{
   static Scanner sc=new Scanner(System.in);
   double x,y;
   
   D2Point()
   {
      x=0;
   }
   
   D2Point(double nx, double ny)
   {
      x=nx; 
      y=ny;
   }
   
   void distance2d(D2Point b)
   {
	   //System.out.println(b.x+"  "+ this.x);
     double ans=Math.sqrt(Math.abs(Math.pow((b.x-this.x),2)+(Math.pow((b.y-this .y),2))));
     System.out.println("Distance is" + ans);
   }
   
  /* public static void main(String args[])
   {
     D2Point ob=new D2Point(3,4);
     D2Point ob2=new D2Point();
     ob2.x=5;
     ob2.y=2;
     ob.distance2d(ob2);
    } */
}


