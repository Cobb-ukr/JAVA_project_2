
import java.io.*;
class inst
{
  static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  void m1()throws IOException
  {
    String A[]=new String[10];
    System.out.println("enter the elements  Enter 0 to end");
    for(int i=0; i<10; i++)
    { 

      A[i]=br.readLine();
   }
       System.out.println(A);
  }
   public static void main(String args[])throws IOException
   { 
     inst br=new inst();
     br.m1();
   }
  }
