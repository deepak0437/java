class Human
{
String Name, Gender;
void detail(String N, String G)
{
Name=N;
Gender=G;
System.out.println("Name="+Name);
System.out.println("Gender="+Gender);
}
}
class Man extends Human
{
int age;
void detail(int a)
{
age=a;
System.out.println("age="+age);
}
}
class Woman extends Human
{
int ages;
void detail(int b)
{
ages= b;
System.out.println("ages="+ages);
}
}
class Being
{
public static void main(String[]args)
{
Man obj= new Man();
obj.detail("tds", "male");
obj.detail(76);
obj.detail("tgs", "female");
obj.detail(86);
if(76>86)
{
System.out.println("male is elder than female");
}
else
{
System.out.println("female is elder than male");
}
}
}