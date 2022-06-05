import java.io.*;
class sample4
{
int func(int x, int y )
{

if(x% y==0)
return ++x;
else
return y--;

}
void m1( )
{
int p=20,q=25;
p=func( q, p);
System.out.println(p+"\t"+q);
q=func(p ,q);
System.out.println(p+"\t"+q);
}
public static void main(String args[])
{
sample4 obj=new sample4();
obj.m1();
}
}
