import java.io.*;
import java.util.*;
class decode
{
	Scanner sc=new Scanner(System.in);
     String encoded,decoded="";
     void input()
     {
           
           System.out.println("Enter a Encoded Message");
           encoded=sc.next();
     }
     void reverse()
     {
           char ch;
           String str=new String();
           for(int i=0;i<encoded.length();i++)
           {
                ch=encoded.charAt(i);
                str=ch+str;
           }
           encoded=str;
     }
     void decod()
     {
           String str=new String(),x=new String();
           char ch1;
           char ch;
           int code=0;
           for(int i=0;i<encoded.length();i++)
           {
                ch=encoded.charAt(i);
                str=str+ch;
                if(str.length()==2)
                {
                     code=Integer.parseInt(str);
                     if(code>=65&&code<=90||code>=97&&code<=100)
                     {
                           ch1=(char)(code);
                           x=x+ch1;
                           str="";
                     }
                     if (code==32)
                     {
                           ch1=' ';
                           x=x+ch1;
                           str="";
                     }                   
                }
                else if(str.length()==3)
                {
                     code=Integer.parseInt(str);
                     if(code>=100&&code<=122)
                     {
                           ch1=(char)(code);
                           x=x+ch1;
                           str="";
                     }
                }
               
           }
           decoded=decoded+x;
     }
     void display()
     {
           System.out.println("Decoded Message="+decoded);
     }
     public static void main(String args[])
     {
        decode ob=new decode();
           ob.input();
           ob.reverse();
           ob.decod();
           ob.display();
     }
}

  
   
