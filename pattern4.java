class pattern4
{
  void m1()
  {
    for(int r=1; r<=5; r++)
    {
       for(int j=1; j<=r; j++)
       {
         System.out.print("  ");
       }
       for(int c=r; c<=5; c++)
       {
         System.out.print(c+" ");
       }
     System.out.println();
    }
    for(int i=4; i>=1; i--)
    {
		for(int j=1; j<=i; j++)
		{
		 System.out.print("  ");
		}
		for(int k=i; k<=5; k++)
		{
			System.out.print(k+" ");
		}
		System.out.println();
	}
  }
   public static void main(String args[])
   {
     pattern4 ob=new pattern4();
     ob.m1();
   }
} 
