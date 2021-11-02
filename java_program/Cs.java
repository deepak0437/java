import java.util.*;
class Cs
{
 public static void main(String args[])
  { 
   int rem=0, sum=0;
   int x;
Scanner s= new Scanner(System.in);
System.out.println("enter values");
x= s.nextInt();
   while(x>0)
   {
    rem= (x%10);
    x=x/10;
    rem=rem*(x%10);
    sum=sum+rem;
   }
    System.out.println("Sum of conjugative digits of given number is = "+sum);
  }
}