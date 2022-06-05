import java.io.*;
import java.util.*;
class sample_prac1
{
	static Scanner sc=new Scanner(System.in);
	void m1()
	{
		int input;
		System.out.println("Enter the input number");
		input=sc.nextInt();
		if(input>2 && input<100)
		{
		int binary[]=new int[100];
		int decimal=input;
		int index=0;
		int sum=0;
		
		while(decimal>0)
		{
			binary[index++]=decimal%2;
			decimal=decimal/2;
			if(binary[index]==0)
			sum++;
		}
		
		System.out.print("Binary Equivalent= ");
		for(int i=index-1; i>=0; i--)
		System.out.print(binary[i]);
		
				System.out.println();
				System.out.println("No. of ones="+sum);
				if(sum%2==0)
				{
					System.out.println("EVIL NUMBER");
				}
				else
				System.out.println("NOT AN EVIL NUMBER");
			}
	}
	public static void main(String args[])
	{
		sample_prac1 ob=new sample_prac1();
		ob.m1();
	}
	
}
