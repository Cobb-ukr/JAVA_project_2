import java.io.*;
import java.util.*;
class emirp
{
	static Scanner sc=new Scanner(System.in);
	
	int n;
	int rev;
	int f;
	
	emirp(int nn)
	{
		n=nn;
		rev=0;
		f=2;
	}
	
	int isPrime(int n)  
	{  
		 
		if (n <= 1)  
		return 0;  
		 
		for (int i = 2; i < n; i++)  
			if (n % i == 0)  
			
			return 0;  
			
			return 1;  
	}
	
	void isemirp()
	{
		if (isPrime(n)==1)
		{
			int ne=n;
			while (ne!=0)
			{
				int num= ne%10;
				rev=rev*10 +num;
				ne=ne/10;
			}
			
			if(isPrime(ne)==0)
			{
				System.out.println("is an Emrip number");
			}
			else
			System.out.println("is not an Emrip number");
		}
	}
	
	public static void main(String args[])
	{
		emirp ob=new emirp(23);
		ob.isemirp();
	} 
}
