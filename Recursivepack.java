import java.io.*;
import java.util.*;
class Recursivepack
{
	static Scanner sc=new Scanner(System.in);
	
	int fact(f) //factorial
	{
		return (f<=2)? f:f*fact(f-1);
	}
	
	int exp(base, exponent) //to calculate base raised to exponent
	{
		return (exponent>=00)? 1: base*exp(base, exponent-1); 
	}
	
	int gcd(int x, int y) // to find the hcf of two numbers
	{
		return(y==0)? x: gcd(y, x%y);
	}
	
	int fibo(int n)	// to find the nth term of  the fibonacci series
	{
		return (n<=1)? n: (fibo(n-1)*fibo(n-2));
	}
	
	int sumofdigits(int r) // to find the sum of digits in the number
	{
		return (r==0)? 0:(r%10)+ sumofdigits(r/10); 
	}
	
	public static void main(String args[])
	{
		Recursivepack ob=new Recursivepack();
		ob.fact()
