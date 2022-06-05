class pattern7
{
  void m1()
  {
	  int x=5,y=2;
   for(int i=1; i<=5; i++)
   {
     for(int j=1; j<=i; j++)
     {
       System.out.print("  ");
     }
     for(int c=i; c<=5; c++)
     {
       System.out.print(x+" ");
     }
    System.out.println();
    x--;
   }
  for(int i=4; i>=1; i--)
  {
	  for(int j=1; j<=i; j++)
	  {
	   System.out.print("  ");
	  }
	  for(int c=i; c<=5; c++)
	  {
		  System.out.print(y+" ");
	  }
	  System.out.println();
	  y++;
  }
  }
  public static void main(String args[])
  {
    pattern7 ob=new pattern7();
    ob.m1();
  }
}
