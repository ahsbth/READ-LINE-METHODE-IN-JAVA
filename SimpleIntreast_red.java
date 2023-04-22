import java.io.*;
class SimpleIntreast_red
{
public static void main(String args[]) throws IOException
{
float p,r,t;
double si;
InputStreamReader ISR=new InputStreamReader(System.in);
BufferedReader Br=new BufferedReader(ISR);
System.out.println("Enter principle,rate and time=");
p=Integer.parseInt(Br.readLine());
r=Integer.parseInt(Br.readLine());
t=Integer.parseInt(Br.readLine());
si=p*r*t/100;
System.out.println("SimpleIntreast="+si);
}
}
