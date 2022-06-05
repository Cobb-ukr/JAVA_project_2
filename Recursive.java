import java.io.*;
import java.util.*;
class Recursive
{
	
  static Scanner sc=new Scanner(System.in);
  static int rce(int a) 
  {
 

   if( a==1)
    return 1;
    
    else
    {
		return (a* rce(a-1));
	}
  }

  
  public static void main(String args[]) 
  {
    System.out.println("enter a number");
    int num=sc.nextInt();
    Recursive ob=new Recursive();
    int ans= ob.rce(num);
    double res=Math.pow(num,ans);
    System.out.println(" ans is "+ res);
  }
}
   
