import java.util.*;
class TwoD
{
public static void main(String[]args)
{
int i,j;
int a[][]= new int[3][3];
Scanner s= new Scanner(System.in);
System.out.println("enter values");
for(i=0; i<3; i++)
{
for(j=0; j<3; j++)
{
a[i][j]= s.nextInt();
}
}
for(i=0; i<3; i++)
{
for(j=0; j<3; j++)
{
System.out.println(a[i][j]);
}
System.out.println();
}
}
}