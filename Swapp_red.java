import java.io.*;
import java.lang.*;
class Swapp_red
{
public static void main(String args[]) throws IOException
{
InputStreamReader ISR=new InputStreamReader(System.in);
BufferedReader Br=new BufferedReader(ISR);
int a,b;
System.out.println("Enter two values=");
a=Integer.parseInt(Br.readLine());
b=Integer.parseInt(Br.readLine());
System.out.println("Before Swapping 1st value="+a+"\t 2nd values="+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("After Swapping 1st Value="+a+"\t 2nd value="+b);
}
}

