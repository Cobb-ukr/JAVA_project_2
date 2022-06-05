class pattern8
{
  void m1()
  {
    for(int r=5; r>=1; r--)
    {
      int count=1;
      for(int c=1; c<=r; c++)
      {
        System.out.print(count+"   ");
        count++;
      }
		  for(int c=1; c<=4; c++)
		  {
			  System.out.print("&");
		  }
      System.out.println();
    }
  }
  public static void main(String args[])   
  { 
    pattern8 ob=new pattern8();
    ob.m1();
  }
}    
