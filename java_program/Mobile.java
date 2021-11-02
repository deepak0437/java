class A
{
int age;
String name;
void shift(int p, String s)
{
int age= p;
String name= s;
System.out.println("age="+age);
System.out.println("name="+name);
}
}
class Mobile
{
public static void main(String[]args)
{
A obj= new A();
obj.shift(76, "Deepak");
obj.shift(99, "Rohit");
}
}