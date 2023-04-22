import java.io.*;
class compound_inter
{
public static void main(String args[]) throws IOException
{
float p,r,t;
InputStreamReader isr=new InputStreamReader(Sysytem.in);
BufferedReader br=new BufferedReader(isr);
System.out.print("Enter principle,rate,time=");
p=Float.parseFloat(br.readLine());
r=Float.parseFloat(br.readLine());
t=Float.parseFloat(br.readLine());
double ci=p*Math.pow(1+r/100),t)-1;
System.out.println("CompoundInterreast="+ci);
}
}
