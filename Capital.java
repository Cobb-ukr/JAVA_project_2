import java.util.*;
import java.io.*;
class Capital
{
	static Scanner sc=new Scanner(System.in);
	
    String sent;
    int freq;
    Capital()
    {
        sent="";
        freq=0;
    }

    void input()
    {
       
        System.out.println("Enter the sentence");
        sent=sc.nextLine();
        sent=sent+" ";
    }

    boolean isCap(String w)
    {
        char ch=w.charAt(0) ;
        if (Character.isUpperCase(ch)==true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    void display()
    {
        
        String word1="";
        char ch1=' ';
        for (int i=0;i< sent.length();i++)
        {
            ch1=sent.charAt(i);
            if(ch1==' ')
            {
                if(isCap(word1)==true)
                {
                    
                    freq++;
                }
             
                word1="";
            }
            else
            {
                word1=word1+ch1;
            }
        }

		System.out.println("original input="+sent);
        System.out.println("Freqency of  words begining with a capital letter  ="+freq) ;
    }


    public static void main(String args[])
    {
        Capital ob=new Capital();
        ob.input();
        ob.display() ;
    }
}
