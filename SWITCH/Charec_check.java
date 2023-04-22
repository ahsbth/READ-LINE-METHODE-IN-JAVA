import java.io.*;
class Charec_check
{
public static void main(String args[])
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("ENTER A CHRECTER=");
char k=Charecter.parseChar(br.readLine());
if((k>=65&&k<=90)||(k>=95&&k<=122))
{
char ch =k.toUpperCase();
switch(ch)
{
case 'A':System.out.println("Vowel");
        break;
case 'E':System.out.println("Vowel");
        break;
case 'O':System.out.println("Vowel");
        break;
case 'I':System.out.println("Vowel");
        break;
case 'U':System.out.println("Vowel");
        break;
default:System.out.println("Consonant");
}
}
else
{
System.out.println("Invalid Charecter");
}
}
}

        
		       
						
		
								