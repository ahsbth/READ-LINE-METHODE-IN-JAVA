import java.io.*;
class Find_sm
{
public static void main(String args[]) throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.print("enter a Three no=");
int x,y,z;
x=Integer.parseInt(br.readLine());
y=Integer.parseInt(br.readLine());
z=Integer.parseInt(br.readLine());
if(x<y&&x<z)
{
 System.out.println("smallest="+x);
}
if(y<x&&y<z)
{
 System.out.println("smallest="+y);
}
if(z<x&&z<y)
{
System.out.println("smallest="+z);
}
}
}

