import java.io.*;
class Even_odd
{
public static void main(String args[]) throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.print("enter a no=");
int x=Integer.parseInt(br.readLine());
if(x%2==0)
{
System.out.println("even");
}
else
{
System.out.println("odd");
}
}
}
