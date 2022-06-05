class pattern1      
{                                                 
 void m1()
 {
   int count=0;
   for(int r=0; r<=3; r++)
   {
      for(int c=0; c<=r; c++)
      {
        System.out.print(count+" ");
        count++;
      }
      System.out.println();
   }
   {
   count=5;
   for(int r=3; r>=1; r--)
   {
      for(int c=1; c<=r; c++)
      {
        System.out.print(count+" ");
        count--;
      }
    System.out.println();
   }
   }
   
  }
  public static void main(String args[])
  {
    pattern1 ob=new pattern1();
    ob.m1();
  }
}
