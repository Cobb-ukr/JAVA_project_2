import java.io.*;
import java.util.*;
class InSort
{
    static Scanner sc=new Scanner(System.in);
    void m1()
    {
		 int a[]={8,3,5,7,6,4};
		 int temp=0;
		 int ptr=0;
		 
		//System.out.println(a.length);  //=6
		 for(int i=1; i<6; i++)
		 {
			 temp=a[i];
			 ptr=i-1;
			 
			 while(ptr>=0 && a[ptr]<temp)
			 {
				 a[ptr+1]=a[ptr];
				 ptr--;
			 }
			 a[ptr+1]=temp;
		 }
			 for(int i=0; i<6; i++)
			 {
				  System.out.print(a[i]+" ");  //= 8, 7, 6, 5, 4, 3
				  
			 }
     }
	 public static void main(String args[])
	 {
		 InSort ob=new InSort();
		 ob.m1();
	 }
 }
