import java.util.*;
class Reverse
{
public static void main(String[]args)
{
int num;
Scanner s= new Scanner(System.in);
System.out.println("enter nos");
num= s.nextInt();
int rev= 0; 
int rem= 0;
while(num!=0)
{
   rem= num%10;
   rev= rev*10+rem;
   num= num/10;
}
System.out.println(rev);
}
}
