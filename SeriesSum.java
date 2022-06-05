import java.io.*;
import java.util.*;
class SeriesSum
{
  static Scanner sc=new Scanner(System.in);
  int x, n;
  double sum;
  double findfact(int a)
  {
    int b=1;
    while(b<a)
    {
       for(int i=1; i<b; i++)
       {
          int fct=1;
          fct=fct+i;
          b++;
       }
    }
    return fct;
  }
  double findpower(int c, int d)
  {
    int e=2;
    while(e<=d)
    {
		int ans=0;
      int an= Math.pow(c,e);
      e++;
      ans=ans+an;
    }
    return ans;
  }
  void calculate()
  {
      double a1= ans/fct;
  }
  void display()
  {
     System.out.println(a1);
  }
  public staic void main(String args[])
  {
     SeriesSum ob=new SeriesSum();    
     System.out.println(" enter  an integer number");
     x=sc.nextInt();
     System.out.println(" enter the number of terms");
     n=sc.nextInt();
     ob.findfact(n);
     ob.findpower(x,n);
     ob.calculate();
     ob.display();
  }
} 
