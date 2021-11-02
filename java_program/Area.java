class B
{
int r;
int l;
int b;
B()
{
float pi=3.14f;
r=4;
l=6;
b=7;
System.out.println("Area of circle="+ 3.14*r*r);
System.out.println("Area of rectangle="+ l*b);
}
B(int r1, int l1, int b1)
{
float pi=3.14f;
System.out.println("Area of circle1="+ 3.14*r1*r1);
System.out.println("Area of rectangle1="+ l1*b1);
}
}
class Area
{
public static void main(String[]args)
{
B obj= new B();
B obj1= new B(9, 5, 2);
}
}