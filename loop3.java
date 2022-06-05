import java.util.*;
class loop3
{
   static Scanner sc=new Scanner(System.in);
   void rd()
   {
      double n;
      System.out.println("enter the end limit");
      n=sc.nextDouble();
      double s=1;
      do
      {
         s=s*s;
         if(s%2==0)
         {
            System.out.print(1/s+"+");
         }
         else
         {
            System.out.print(1/s+"+");
         }
         s++;
       }while(s<=n);
   }
      
   public static void main(String args[])
   {
     loop3 ob=new loop3();
     ob.rd();
   }
}
