import java.util.*;
class Alpha
{
public static void main(String[]args)
{
char ch;
Scanner s= new Scanner(System.in);
System.out.println("enter alphabet");
ch =s.next().charAt(0);
if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
{
System.out.println("vowel");
}
else
{
System.out.println("consonent");
}
}
} 
