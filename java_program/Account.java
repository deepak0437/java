import java.util.*;
class Bank
{
String holdername;
String address;
int accountno;
int balance;
void details(String h, String d, int a, int b)
{
holdername= h;
address= d;
accountno= a;
balance= b;
System.out.println("holdrename="+holdername);
System.out.println("address="+address);
System.out.println("accountno="+accountno);
System.out.println("balance="+balance);
}
int withdawbalance;
int remainingbalance;
void withdraw(int n)
{
withdawbalance= n;
remainingbalance= (balance-withdawbalance);
System.out.println(remainingbalance);
System.out.println("remainingbalance="+remainingbalance);
}
int depositebalance;
int totalbalance;
void deposit(int t)
{
depositebalance= t;
totalbalance= (remainingbalance+depositebalance);
System.out.println(totalbalance);
System.out.println("totalbalance="+totalbalance);
}
}
class Saving extends Bank
{
int rateofintrest;
float totalamount;
void amount(int f)
{
rateofintrest= f;
totalamount= (totalbalance*f)/100+totalbalance;
System.out.println(totalamount);
System.out.println("totlamount="+totalamount);
}
}
class account
{
public static void main(String[]args)
{
Saving obj= new Saving();
Scanner s= new Scanner(System.in);
System.out.println("enter holdername");
String h= s.next();
System.out.println("enter address"); 
String d= s.next();
System.out.println("enter accountno");
int a= s.nextInt();
System.out.println("enter balance");
int b= s.nextInt();
obj.details(h, d, a, b);
System.out.println("enter withdawbalance");
int q= s.nextInt();
obj.withdraw(q);
System.out.println("enters depositebalance");
int r= s.nextInt();
obj.deposit(r);
System.out.println("enter rateofintrest");
int f= s.nextInt();
obj.amount(f);
}
}