import java.io.*;
class Takshashila
{
public static void main(String args[])
{
try
{
DataInputStream dis = new DataInputStream(System.in);
System.out.println("TAKSHASHILA UNIVERSITY");
System.out.println("----------------------------------");
System.out.println("Student Marklist");
System.out.println("Enter the Enroll Number:");
String s1 = dis.readLine();
int e = Integer.parseInt(s1);
System.out.println("Enter the Student name:");
String s2 = dis.readLine();
System.out.println("Enter the java mark:");
String s3 = dis.readLine();
int j = Integer.parseInt(s3);
System.out.println("Enter the SE mark:");
String s4 = dis.readLine();
int s = Integer.parseInt(s4);
System.out.println("Enter the CN mark:");
String s5 = dis.readLine();
int c = Integer.parseInt(s5);
System.out.println("Result");
int t = j+s+c;
System.out.println("Total :"+ t);
int a = j+s+c/3;
System.out.println("Average:" + a);
}
catch(Exception e)
{
System.out.println("Error:"+e.getMessage());
}
}
}

