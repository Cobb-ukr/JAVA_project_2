import java.util.*; 
class Disarium  
{ 
static Scanner sc=new Scanner(System.in); int num,size; 
int sum=0; 
void countDigit() 
{ 
System.out.println("Enter the number"); num=sc.nextInt(); 
int n=num; 
while(n>0)
{ 
size++; 
n=n/10; 
} 
} 
int sumofDigits() 
{ 
int n=num; 
while(n>0) 
{ 
int digit=n%10; 
sum=sum+(int)Math.pow(digit,size); 
System.out.println(digit+" "+size+" "+sum); size--; 
n=n/10; 
} 
return sum; 
} 
void check() 
{ 
if (sum==num) 
 {  
 System.out.println("Disarium number");  } 
else 
 { 
 System.out.println("Not a Disarium number");  } 
} 
public static void main(String args[])
{ 
Disarium obj=new Disarium(); 
obj.countDigit(); 
int a=obj.sumofDigits(); 
obj.check(); 
} 
} 
