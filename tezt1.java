import java.io.*;
import java.util.*;
class tezt1
{
 static Scanner sc=new Scanner(System.in);
 void m1()
 {
   System.out.println("enter the string sentence");
   String st=sc.nextLine();
   String word[]=st.split("\\s");
   for(String w:word)
   {
    System.out.println(w);
   }
 }
 public static void main(String args[])
 {
   tezt1 ob=new tezt1();
   ob.m1();
 }
} 
