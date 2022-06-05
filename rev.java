import java.io.*;
import java.util.*;
class rev
{
  static Scanner sc=new Scanner(System.in);
  void numbers()
  {
    int rem=0, nn=0;
    for(int num=4325676; num>0; num=num/10)
    {
      rem=num%10;
      nn=(nn+rem)*10;
     // System.out.println(num);	
    }
   
   System.out.println(nn);
  }
  public static void main(String args[])
  {
	  rev obj=new rev();
	  obj.numbers();
  }
}

