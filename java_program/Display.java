import java.util.*;
class Display
{
public static void main(String[]args)
{
int i;
float a[]= new float[5];
Scanner s= new Scanner(System.in);
System.out.println("enter avalue");
for(i=0; i<5; i++)
{
a[i]= s.nextFloat();
}
for(i=0; i<5; i++)
{
System.out.print(a[i]+" ");
}
}
}