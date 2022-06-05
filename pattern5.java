class pattern5
{
  void m1()
  {
    for(int r=3; r>=1; r--)
    {  
      for(int c=1; c<=r; c++)
      {
        System.out.print("#");
      } 
      for(int i=r; i<=3; i++)
      {
		   System.out.print("&");
	  }
      System.out.println();
    }
   }
   public static void main(String args[])
   {
     pattern5 ob=new pattern5();
     ob.m1();
   }
}
    
