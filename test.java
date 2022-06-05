import java.util.*;
import java.io.*;
class test
{ 
	static Scanner sc=new Scanner(System.in);
	void m1()
     {

        System.out.println("Enter a string:");
        String str = sc.nextLine();
        str = str.toUpperCase();
        int len = str.length();
        
        StringBuffer sb = new StringBuffer();
        
        int open = -1;  
        
        for (int i = 0; i < len; i++) 
        {
            char ch = str.charAt(i);
            if (ch == '(') 
            {
				
                if (open != -1) 
                {
                    System.out.println("Sorry, an invalid string");
                    return;
                }
                
                open = i;
            }
            
            if (open == -1) 
            {
                sb.append(ch);
            }
            
            if (ch == ')') 
            {
                if (open == -1) 
                {
                    System.out.println("Sorry, an invalid string");
                    return;
                }
                
                open = -1;
            }
            
            
        }

        StringTokenizer st = new StringTokenizer(sb.toString());
        while (st.hasMoreTokens()) 
        {
            System.out.print(st.nextToken());
            System.out.print(" ");
        }

    }
    
    public static void main(String args[])
    {
		test ob=new test();
		ob.m1();
	}
}
