import java.io.*;
class Electricitybill
{
public static void main(String args[])
{
try
{
DataInputStream dis = new DataInputStream(System.in);
System.out.println("GOVERNMENT OF TAMILNADU");
System.out.println("Electricity bill");
System.out.println("---------------------------------");
System.out.println("Enter the EB Number:");
String s1 = dis.readLine();
int e = Integer.parseInt(s1);
System.out.println("Enter the customer name:");
String s2 = dis.readLine();
System.out.println("Enter the precious unit:");
String s3 = dis.readLine();
int p = Integer.parseInt(s3);
System.out.println("Enter the customer current:");
String s4 = dis.readLine();
int c = Integer.parseInt(s4);
System.out.println("Result");
int x = c - p;
System.out.println("Unit Consumed:"+ x);
int a = (c-p) * 5;
System.out.println("Total Amount RS:" + a);
}
catch(Exception e)
{
System.out.println("Error:"+e.getMessage());
}
}
}

