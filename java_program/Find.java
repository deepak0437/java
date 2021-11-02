import java.util.*;
class Ass
{
int pointa;
int pointb;
void pointer(int x, int y)
{
pointa= x;
pointb= y;
}
int dis;
void different()
{
dis= pointb- pointa;
System.out.println("dis="+dis);
}
void circle()
{
double area;
area= 3.14*dis*dis;
System.out.println("area="+area);
}
}
class Find
{
public static void main(String[]args)
{
Ass obj= new Ass();
Scanner s= new Scanner(System.in);
System.out.println("enter pointa");
int x= s.nextInt();
System.out.println("enter pointb");
int y= s.nextInt();
obj.pointer(x, y);
obj.different();
obj.circle();
}
}