import java.io.*;
import java.util.*;
class Queue
{
	static Scanner sc=new Scanner(System.in);
	
	int arr[] = new int[15];
	int cap;
	int front;
	int rear;
	
	Queue(int nx)
	{
		cap=nx;
		front=0;
		rear =-1;
	}
	
	void enqueue(int num)
	{
		if(rear==arr.length)
			System.out.println("Queue Overflow");
		else if(front == -1 && rear ==-1)
		{
			front++;
			rear++;
			arr[rear]=num;
		}
		else
		{
			rear++;
			arr[rear]=num;
		}
	}
	
	
	int dequeue()
	{
		if(front==-1 && rear==-1)
		{
			System.out.println("Queue is empty. cannot remove any element");
			System.out.println("Queue underflow");
			return -9999;
		}
		
		if(front==rear)
		{
			int val= arr[front];
			front=-1;
			rear=-1;
			return val;
		}
		else
		{
			System.out.println("Partially filled");
			int val=arr[front];
			return val;
		}
	}
		
		
	void display()
	{
		int i=front;
		while(i<=rear)
		{
			System.out.println(arr[i]);
			i++;
		}
	}
	
	public static void main(String args[])
	{
		Queue ob=new Queue(5);
		ob.enqueue(39);
		ob.enqueue(38);
		ob.enqueue(37);
		ob.enqueue(36);
		ob.enqueue(35);
		ob.display();
		ob.dequeue();
		ob.display();
	}
}
