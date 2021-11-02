import java.util.*;
class Name
{
String studentname;
int noofclasheld;
int noofclasattend;
void details(String n, int h, int a)
{
studentname= n;
noofclasheld= h;
noofclasattend= a;
System.out.println("studentname="+studentname);
System.out.println("noofclasheld="+noofclasheld);
System.out.println("noofclasattend="+noofclasattend);
}
float percentofclas;
void check()
{
percentofclas= (noofclasattend*100)/noofclasheld;
System.out.println(percentofclas);
System.out.println("percentofclas="+percentofclas);
}
}
class Exam extends Name
{
void allow()
{
if(percentofclas>=75)
{
System.out.println("student allowed to sit in exam");
System.out.println("DATE SHEET");
System.out.println("5/11/19= English");
System.out.println("8/11/19= Hindi");
System.out.println("10/11/19= maths");
}
else
{
System.out.println("student not allows to sit in exam");
System.out.println("first give your fine");
}
}
}
class School
{
public static void main(String[]args)
{
Exam obj= new Exam();
Scanner s= new Scanner(System.in);
System.out.println("enter studentname");
String n= s.next();
System.out.println("enternoofclasheld"); 
int h= s.nextInt();
System.out.println("enternoofclasattend");
int a= s.nextInt();
obj.details(n, h, a);
obj.check();
obj.allow();
}
}
