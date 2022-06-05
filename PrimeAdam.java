import java.io.*;
import java.util.*;
class PrimeAdam
{
  static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  void m1()throws IOException
  {
	  int n;
	  System.out.println(" enter the number ");
	  n=Integer.parseInt(br.readLine());
	  int count=0;
	 int rev=0;
	 int n1=0;
	  for(int i=1; i<(n/2); i++)
	  {
		  if(n%i==0)
		  count++;
	  }
	  if(count<=1)
	  {
		  int a=n*n;
		int num=n;
		while(num != 0) 
		{
              n1 = num % 10;
            rev = rev * 10 + n1;
            num =num/ 10;
        }
		  int b= rev*rev;
		  
		  int rev2=0, n2=0, num2=0;
		  n2=b;
		  while(n2!=0)
		  {
			  num2=n2%10;
			  rev2=rev2*10 +num2;
			  n2=n2/10;
		  }
		  if( rev2==a)
		  {
			  
		  System.out.println(n+" is a prime adam number ");
	      }
	      else
	      {
	      System.out.println(n+" is not a prime adam number");
		  }
	  }
	  
  }
  public static void main(String args[])throws IOException
  {
  PrimeAdam ob=new PrimeAdam();
  ob.m1();
  }
}
