import java.io.*;
class rect_redline
{
public static void main(String args[]) throws IOException
{
int l,b;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.print("Enter lenght and breadth=");
l=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
float a =l*b;
System.out.println("area of rectangle="+a);
}
}
