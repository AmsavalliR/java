import java.io.*;
class Supermarkett
{
public static void main(String args[])
{
try
{
DataInputStream dis = new DataInputStream(System.in);
System.out.println("SOWMIYA SUPER MARKET");
System.out.println("No.4,Main road,Villupuram");
System.out.println("---------------------------------");
System.out.println("                  BILL                       ");
System.out.println("---------------------------------");
System.out.println("Enter the Serial Number:");
String s1 = dis.readLine();
int s = Integer.parseInt(s1);
System.out.println("Enter the particulars:");
String s2 = dis.readLine();
System.out.println("Enter the rate:");
String s3 = dis.readLine();
int r = Integer.parseInt(s3);
System.out.println("Enter the quantity:");
String s4 = dis.readLine();
int q = Integer.parseInt(s4);
System.out.println("Result");
int t = r*q;
System.out.println("Total Amount:"+ t);
int g = t*10/100;
System.out.println("GST (10%):" + g);
int gr = t+g;
System.out.println("Grand Total:"+gr);
System.out.println("-----------------------");
System.out.println("Thanks !  visit  again!	");
}
catch(Exception e)
{
System.out.println("Error:"+e.getMessage());
}
}
}

