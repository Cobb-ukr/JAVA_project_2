class pattern2
{
  void m1()
  {
    for(int r=1; r<=4; r++)
    {
		int count=1;
      for(int c=0; c<=r; c++)
      {
         System.out.print("*");    
      }
      for(int c=1; c>=4; c++)
      {
		  System.out.print(count);
	  }
	  count++;
      System.out.println();
    }
   }
   public static void main(String args[])
   {
     pattern2 ob=new pattern2();
     ob.m1();
   }
}
// ****1
// ***21
// **321
// *4321
// 54321
