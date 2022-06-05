import java.io.*;
import java.util.*;
class Check1
{
	static Scanner sc=new Scanner(System.in);
	
	String wrd;
	int len;
	
	Check1()
	{
		wrd="";
		len=0;
	}
	
	void acceptword()
	{
		System.out.println("Enter the word");
		wrd=sc.nextLine();
	}
	
	boolean palindrome()
	{
		StringBuffer s= new StringBuffer(wrd);
		StringBuffer s2= s.reverse();
		
		if(s2==s)
			return true;
		else
			return false;
	}
	
	void display()
	{
		if(palindrome()==true)
			System.out.println("Word is a palindrome");
		else
			System.out.println("Word is not a palindrome");
	}
	
	public static void main(String args[])
	{
		Check1 ob=new Check1();
		ob.acceptword();
		ob.palindrome();
		ob.display();
	}
}
