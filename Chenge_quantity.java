import java.io.*;
class Chenge_quantity
{
public static void main(String args[]) throws IOException
{
InputStreamReader isr =new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Eneter fahreheit=");
float f=Integer.parseInt(br.readLine());
double c=(f-32)/1.8;
System.out.println("Celsious="+c);
}
}

