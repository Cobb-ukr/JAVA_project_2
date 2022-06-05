import java.io.*;
class SearchName

{
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void search()throws IOException
{
String name[]=new String[10];
int pno[]=new int[10];
System.out.println(&quot;Enter Name and Telephone numbers&quot;);
for(int i=0;i&lt;10;i++)
{
name[i]=br.readLine();
pno[i]=Integer.parseInt(br.readLine());
}
System.out.println(&quot;Enter the name you want to search&quot;);
String n=br.readLine();
boolean flag=false;
for(int i=0;i&lt;10;i++)
{

if(name[i].equals(n))
{
System.out.print(name[i]+&quot; &quot;+pno[i]);
flag=true;
break;
}
}
if(flag==false)
System.out.println(&quot;Name not found&quot;);

}

public static void main(String args[])throws IOException
{
SearchName obj=new SearchName();
obj.search();
}

}
