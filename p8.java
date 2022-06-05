class p8
{
  void m1()
  {
	  int count=2;
    for(int i=5; i>=1; i--)
    {
      for(int j=1; j<=i; j++)
      {
        System.out.print("  "+j);
      }
      if(i<5)
      {
		  for(int l=1; l<=count; l++)
		  {
			  System.out.print("   ");
		  }
		  count=count+2;
	  }
      for(int k=i; k>=1; k--)
      {
		  System.out.print("  "+k);
	  }
	  System.out.println();	  
    }
  }
  public static void main(String args[])
  {
    p8 ob=new p8();
    ob.m1();
  }
}
