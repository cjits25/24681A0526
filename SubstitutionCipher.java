import java.util.Scanner;
public class SubstitutionCipher 
{
  static String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  static String key="QWERTYUIOPASDFGHJKLZXCVBNM";
  public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter plain text:");
String text=sc.nextLine().toUpperCase();
String encrypted="";
String decrypted="";
for(char ch:text.toCharArray())
{
int index=alphabet.indexOf(ch);
if(index!=-1)
encrypted+=key.charAt(index);
else
encrypted+=ch;
}
System.out.println("encrypted text:"+encrypted);
for(char ch:encrypted.toCharArray())
{
int index=key.indexOf(ch);
if(index!=-1)
decrypted+=alphabet.charAt(index);
else
decrypted+=ch;
}
System.out.println("decrypted text:"+decrypted);
}
}