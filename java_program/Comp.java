import java.util.*;
class Simple
{
int principal;
int rate;
int time;
void intrest(int p, int r, int t)
{
principal= p;
rate= r;
time= t;
int SI;
SI= p*r/100*t;
System.out.println("SI="+SI);
} 
}
class comp
{
public static void main(String[]args)
{
Simple obj= new Simple();
Scanner s= new Scanner(System.in);
int p= s.nextInt();
System.out.println("enter principal value");
int r= s.nextInt();
System.out.println("enter rate value");
int t= s.nextInt();
System.out.println("enter time value");
obj.intrest(p, r, t);
}
}