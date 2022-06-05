import java.util.*;
class del
{
  static Scanner sc=new Scanner(System.in);
  void m1()
  {
    int a[]=new int[10];
    System.out.println("enter 10 elements");
    for(int i=0; i<10; i++)
    {
      a[i]=sc.nextInt();
    }
    System.out.println("enter the position of the element to be deleted");
    int pos=sc.nextInt();
    for(int i=pos; i<10; i++)
    {
      a[i-1]=a[i];
    }
    System.out.println("the array after deletion");
    for(int i=0; i<10; i++)
    {
      System.out.println(a[i]);
    }
  }
  public static void main(String args[])
  {
    del ob=new del();
    ob.m1();
  }
}
