import java.io.*;
import java.util.*;
class Reverse
{
    static Scanner sc=new Scanner(System.in);
    void reverse(String str)
    {
        if ((str==null)||(str.length() <= 1))
           System.out.println(str);
        else
        {
            System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }
     

    public static void main(String[] args)
    {
		System.out.println("enter the string");
        String str=sc.nextLine();
        Reverse obj = new Reverse();
        obj.reverse(str);
    }   
}
