import java.io.*;
class find
{
public static void main(String args[]) throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.print("Enter two no=");
int x=Integer.parseInt(br.readLine());
int y=Integer.parseInt(br.readLine());
if(x<y)
{
System.out.println("smallest="+x);
}
else
{
System.out.println("smallest="+y);
}
}
}
