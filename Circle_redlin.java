import java.io.*;
class Circle_redlin
{
public static void main(String args[]) throws IOException
{
float r;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.print("Enter radious=");
r=Float.parseFloat(br.readLine());
double a=3.14*r*r;
double p=2*3.14*r;
System.out.println("Area of circle="+a+"\n cicumference="+p);
}
}

