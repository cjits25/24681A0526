import javax.crypto.cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;
import java.util.Scanner;
public class DESExample
{
public static void main(String[] args)throws Exception
{
Scanner sc=new Scanner(String(System.in);
System.out.print("enter Plain Text:");
String text=sc.nextLine();
KeyGenerator kg=Key Generator.getinstance("DES");
SecretKey key=kg.generateKey();
Cipher cipher=Cipher.getinstance("DES");
Cipher.init(Cipher.ENCRYPT_MODE,key);
byte[]encrypted=cipher.doFinal(text.getBytes());
System.out.println("Encrypted Text:"+Base64.get Encoder().encode ToSting(encrypted));
cipher.init(Cipher.DECRYPT_MODE,key);
byte[]decrypted=cipher.doFinal(encrypted);
System.out.println("Decrypted Text:"+new String(decrypted));
}
}