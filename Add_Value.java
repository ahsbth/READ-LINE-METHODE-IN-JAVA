import java.io.*;
class Add_Value
{
public static void main(String args[]) throws IOException
{
InputStreamReader ISR=new InputStreamReader(System.in);
BufferedReader Br=new BufferedReader(ISR);
System.out.println("Enter two values");
int a=Integer.parseInt(Br.readLine());
int b=Integer.parseInt(Br.readLine());
int s=a+b;
System.out.println("Addition="+s);
}
}
