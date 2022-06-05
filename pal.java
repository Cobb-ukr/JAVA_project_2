import java.util.*;
import java.io.*;
class pal
{
   static Scanner sc=new Scanner(System.in);
   
   
   int n;
   void pal()
   {
	   System.out.println("enter the input number");
	   int nn=sc.nextInt();
	   n=nn;
   }
    int rev(int n, int temp)
	{
    
    if (n == 0)
        return temp;
 
    
    
    temp = (temp * 10) + (n % 10); 
 
    return rev(n / 10, temp);
	}
	
	
	boolean check()
	{
		int temp = rev(n, 0);
     
		if (temp == n)
        return true;
		else
        return false;
	}
	
	
	
	
	public static void main(String args[])
	{
		pal ob=new pal();
		ob.pal();
		ob.check();
	}
}
	
