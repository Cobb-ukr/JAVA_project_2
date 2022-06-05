import java.util.*;
import java.io.*;
class Stack
{
	int stk[]=new int[50];
	int cap; //max size of the stack
	int top; //top of the stack/ last element
	
	Stack(int nn)
	{
		cap=nn;
		top=-1;
	}
	void Push(int num)
	{
		if(top==cap-1)
		{
			System.out.println("Stack overflow");
		}
		else
		{
			top++;
			stk[top]=num;
		}
	}
	void Pop()
	{
	}
	void display()
	{
		
		if(top==-1)
		{
			System.out.println("No elements in the stack");
		}
		else
		{
			while(top>=0)
			{
			  System.out.println(stk[top]);
			  top--;
		    }
		}
	}
	
	public static void main(String args[])
	{
		Stack ob=new Stack(5);
		ob.Push(89);
		ob.Push(77);
		ob.Push(67);
		ob.Push(45);
		ob.Push(54);
		ob.Push(1);
		ob.display();
	}
}
