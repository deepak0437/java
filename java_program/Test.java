import java.util.*;
class Vehicle
{
String modelname;
int modelno;
int modelprice;
void motor(String m, int d, int p)
{
modelname= m;
modelno= d;
modelprice= p;
System.out.println("modelname="+modelname);
System.out.println("modelno="+modelno);
System.out.println("modelprice="+modelprice);
}
}
class Car extends Vehicle
{
int discountrate;
float discount;
void motor(int t)
{
discountrate= t;
discount= modelprice-(modelprice*t/100);
System.out.println(discount);
}
}
class Test
{
public static void main(String[]args)
{
Car obj= new Car();
Scanner s = new Scanner(System.in);
System.out.println("enter modelname");
String m= s.next();
System.out.println("enter modelno");
int d= s.nextInt();
System.out.println("enter modelprice");
int p= s.nextInt();
obj.motor("m", d, p);
System.out.println("discountrate");
int t= s.nextInt();
obj.motor(t);
}
}