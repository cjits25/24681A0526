import java.util.Scanner;
public class HillCipher
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int[][]key=new int[2][2];
System.out.println("Enter 2x2 key Matrix:");
for(int i=0;i<2;i++)
for(int j=0;j<2;j++)
key[i][j]=sc.nextInt();
sc.nextLine();
System.out.print("enter plain text(even letters):");
String text=sc.nextLine().toUpperCase().replaceAll("","");
if(text.length()%2!=0)
text +="X";
String cipher="";
for(int i=0;i<text.length();i+=2)
{
int[]p=new int[2];
p[0]=text.charAt(i)-'A';
p[1]=text.charAt(i+1)-'A';
int c1=(key[0][0]*p[0]+key[0][1]*p[1])%26;
int c2=(key[1][0]*p[0]+key[1][1]*p[1])%26;
cipher+=(char)(c1='A');
cipher+=(char)(c2='A');
}
System.out.println("encrypted text:"+cipher);
}
}
 