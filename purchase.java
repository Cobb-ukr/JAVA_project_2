import java.io.*;
import java.util.*;
class stock
{
	String item;
	int qty;
	double rate;
	double amt;
	stock(String i, int q, double r, double a)
	{
		item=i;
		qty=q;
		rate=r;
		amt=a;
	}
	void display()
	{
		System.out.println("Name of the item: "+item);
		System.out.println("Quantity : " +qty);
		System.out.println("Rate: " +rate);
		System.out.println("Amount: " +amt);
	}
}
class purchase extends stock
{
	int pqty;
	double prate;
	purchase(int pq, int pr)
	{
		super("item name" , 100 , 10.0, 1000.0);
		pqty=pq;
		prate=pr;
	}
	
	void update()
	{
		qty= qty+pqty;
		rate=prate;
		amt=qty*rate;
	}
	void display()
	{
		System.out.println("Name of the Item: "+item);
		System.out.println("Quantity : " +qty);
		System.out.println("Rate: " +rate);
		System.out.println("Amount: " +amt);
	}
	public static void main(String args[])
	{
		purchase ob=new purchase(5,15);
		ob.display();
		ob.update();
		ob.display();
	}
}
		
