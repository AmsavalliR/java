import java.io.*;
class Square
{
public static void main(String args[])
{
try
{
DataInputStream dis = new DataInputStream(System.in);
System.out.println("Square & Rectangle");
System.out.println("---------------------------------");
System.out.println("Enter the Area Number:");
String s1 = dis.readLine();
int a = Integer.parseInt(s1);
System.out.println("Enter the L value:");
String s2 = dis.readLine();
int l = Integer.parseInt(s2);
System.out.println("Enter the B value:");
String s3 = dis.readLine();
int b = Integer.parseInt(s3);
System.out.println("Result");
int  s = a*a;
System.out.println("Area of Square:"+ s);
int p = 4 * a;
System.out.println("Perimeter of Square:" + p);
int r = l * b;
System.out.println("Area of  Rectangle:" + r);
int pr = 2 *( l + b);
System.out.println("Perimeter of  Rectangle:" + pr);
}
catch(Exception e)
{
System.out.println("Error:"+e.getMessage());
}
}
}

