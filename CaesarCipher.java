import java.util.Scanner;
public class CaesarCipher
{
   public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Plain Text:");
    String text=sc.nextLine();
    System.out.print("Enter shift Key:");
    int key=sc.nextInt();
    String encrypted="";
    String decrypted="";
    for(char ch:text.toCharArray())
    {
     if(Character.isLetter(ch))
     {
      char base=Character.isUpperCase(ch)?'A':'a';
      encrypted+=(char)((ch-base+key)%26+base);
      }
      else
      {
       encrypted+=ch;
       }
      }
      System.out.println("Encrypted Text:"+encrypted);
      for(char ch:encrypted.toCharArray())
      {
       if(Character.isLetter(ch))
       {
        char base=Character.isUpperCase(ch)?'A':'a';
        decrypted+=(char)((ch-base-key+26)%26+base);
        }
        else
        {
         decrypted+=ch;
          }       
         }
         System.out.println("Decrypted Text:"+decrypted);
        }
       }