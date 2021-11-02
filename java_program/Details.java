class A
{
String personname, email;
int mobno;
void contact()
{
personname="deepaksingh";
email="kumardeepak@gmail.com";
mobno=909715388;
System.out.println("personname="+personname);
System.out.println("email="+email);
System.out.println("mobno="+mobno);
}
}
class B extends A
{
String companyname, website, department, city, address, country;
int pincode;
void companycontact()
{
companyname="tds";
website="tds.com";
department="itsector";
city="Gaya";
address="ganga mahal";
country="India";
pincode= 823001;
System.out.println("companyname="+companyname);
System.out.println("website=" +website);
System.out.println("department=" +department);
System.out.println("city=" +city);
System.out.println("address=" +address);
System.out.println("country=" +country);
System.out.println("pincode=" +pincode);
}
}
class C extends A
{
String city1, country1, designation;
int pin, dob;
void employeecontact()
{
super.contact();
city1="bhubneswar";
country1="India";
designation="project";
pin=751024;
dob=19-8-1999;
System.out.println("city1="+city1);
System.out.println("country1="+country1);
System.out.println("designation="+designation);
System.out.println("pin="+pin);
System.out.println("dob="+dob);
}
}
class Details
{
public static void main(String[]args)
{
C obj1= new C();
obj1.employeecontact();
B obj2= new B();
obj2.companycontact();
}
}