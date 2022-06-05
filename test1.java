import java.io.*;
import java.util.*;
class test1
{
  public static void main(String args[])
  {
     String a="Hello I am a test program";
     StringTokenizer at= new StringTokenizer(a); 
     while(at.hasMoreTokens())
     {
     System.out.println(at.nextToken());
     }
  }
}
