import java.io.*;
import java.util.Arrays;
class Tester
{
    void m1()
    {
        String Input="this is the sample text for the string";
        String d[]=Input.split(" ");
        int len=d.length;
        
        for(int i = 0; i<len; i++)   
         {  
             for (int j = i+1; j<len; j++)  
             {  
            
                if(d[i].compareTo(d[j])>0)   
                {  
  
                    String temp1 = d[i];  
                    d[i] = d[j];  
                    d[j] = temp1;  
                 }  
              }  
           }
           
           String Inp= Arrays.toString(d);
           System.out.println(Inp);
           
           
    }
    public static void main(String args[])
    {
        Tester ob=new Tester();
        ob.m1();
    }
}
