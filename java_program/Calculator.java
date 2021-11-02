import java.util.*;
class Calculator
{
  public static void main(String[]args)
{
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    char c = s.next().charAt(0);
    int d = display(a, b, c);
    System.out.println(d);

static 
 int display;
  int a;
  int b;
  char c;
  {
    int a1 = 0;
    if (c == '*')
    {
      a1 = a * b;
    }
    else if (c == '+')
    {
      a1 = a + b;
    }
    else if (c == '-')
    {
      a1 = a - b;
    }
    else if (c == '/')
    {
      a1 = a / b;
    }
    else if (c == '%')
    {
      a1 = a % b;
    }
 }
  }
}