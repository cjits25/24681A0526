import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Basae64;
import java.util.Scanner;
public class BlowfishExample
{
public static void main(String[] args)throws Exception
{
Scanner sc=new Scanner(System.in);
System.out.print("enter plain text:");
String text=sc.nextLine();
KeyGenerator kg=KeyGenerator.getinstance("Blowfish");
SceretKey key=kg.generateKey();
Cipher.cipher=Cipher.getinstance("Blowfish");
cipher.init(Cipher ENCRYPT_MODE,Key);
byte[] encrypted=cipher.doFinal(text.getBytes());
System.out.println("Encrypted text:"+Base64.getEncoded().encode ToString(encrypted);
Cipher.init(Cipher.DECRYPT_MODE,key);
byte[] decrypted= Cipher.doFinal(encrypted);
System.out.println("Decrypted Text:"+new String(decrypted)):
}
}
