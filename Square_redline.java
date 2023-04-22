import java.io.*;
class Square_redline
{
public static void main(String args[]) throws IOException
{
int s;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.print("Enter side of square=");
s=Integer.parseInt(br.readLine());
float a=s*s;
float p=4*s;
System.out.println("Area of square="+a+"\n perimeter="+p);
}
}