import java.util.*;
class A
{
void Evenodd (int r)
{
if(r%2==0)
{
System.out.println("no is even="+r);
}
else
{
System.out.println("no is odd="+r);
}
}

void Evenodd (int a, int b, int c)
{
int large=0;

if(a> large)
large =a;

if(b> large)
large =b;

if(c> large)
large =c;


System.out.println("large="+large);
}

}
class Method
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter values");
int m= s.nextInt();
int x= s.nextInt();
int y= s.nextInt();
int z= s.nextInt();

A obj= new A();

obj.Evenodd(m);
System.out.println();
obj.Evenodd(x,y,z);
}
}
