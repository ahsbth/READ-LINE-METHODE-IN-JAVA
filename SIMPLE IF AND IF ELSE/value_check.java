import java.io.*;
class value_check
{
public static void main(String args[]) throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter no=");
int n=Integer.parseInt(br.readLine());
if(n>0)
{
System.out.println("+ve");
}
if(n<0)
{
System.out.println("-ve");
}
if(n==0)
{
System.out.println("zero");
}
}
}

