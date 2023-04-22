import java.io.*;
class Check_red
{
public static void main(String args[])  throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter a no=");
int x=Integer.parseInt(br.readLine());
if(x%2==0)
{
System.out.println("Evean");
}
else
{
System.out.println("Odd");
}
}
}
