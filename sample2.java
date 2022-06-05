import java.io.*;
import java.util.*;
import java.lang.*;
class sample2
{
	static Scanner sc=new Scanner(System.in);
	void m1()
	{
		System.out.println("enter the input string");
		String MyString=sc.nextLine();
		
		String s=MyString;
		StringTokenizer a=new StringTokenizer(s);
		
		String arr[]=new String[10];
		
		int ab=0;
		while(a.hasMoreTokens() && ab<10 )
		{
			arr[ab]=a.nextToken();
			ab++;
		}
		int len=arr.length;
		
		
		System.out.println("the original sentence is "+ MyString);
		for(int i = 0; i<len-1; i++) 
		{
         for (int j = i+1; j<arr.length; j++) 
         {
            if(arr[i].compareTo(arr[j])>0) 
            {
               String temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
            }
         }
      }
		

			
			System.out.println("New sentence is:");
		for(int x=0; x<10; x++)
		{
			System.out.print(arr[x]+",");
		}	
		
	
	}
	public static void main(String args[])
	{
		sample2 ob=new sample2();
		ob.m1();
	}
}
		
