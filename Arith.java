import java.io.*;
class Arith
{
 public static void main(String args[])
{
 try
{
DataInputStream  dis = new DataInputStream(System.in);
System.out.println("ARITHMETIC OPERATION");
System.out.println("-------------------------------");
System.out.println("Enter the first number:");
String s1 = dis.readLine();
int f = Integer.parseInt(s1);
System.out.println("Enter the second number");
String s2 = dis.readLine();
int s = Integer.parseInt(s2);
System.out.println("Result");
int a = f + s;
System.out.println("Add :"+ a);
int d = f - s;
System.out.println("Sub:" + d);
 int p = f * s;
System.out.println("Mul:" + p);
int q = f / s;
System.out.println("Div:" + q);
int m = f % s;
System.out.println("mod:" + m);
}
catch(Exception e)
{
System.out.println("Error:"+e.getMessage());
}
}
}
