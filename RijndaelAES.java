import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;
import java.util.Scanner;

public class RijndaelAES {
public static void main(String[] args) throws Exception {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Plain Text: ");
String text = sc.nextLine();
KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
keyGenerator.init(128);
SecretKey key = keyGenerator.generateKey();
Cipher cipher = Cipher.getInstance("AES");
cipher.init(Cipher.ENCRYPT_MODE, key);
byte[] encrypted = cipher.doFinal(text.getBytes());
System.out.println("Encrypted Text: "
+ Base64.getEncoder().encodeToString(encrypted));
cipher.init(Cipher.DECRYPT_MODE, key);
byte[] decrypted = cipher.doFinal(encrypted);
System.out.println("Decrypted Text: " + new String(decrypted));
sc.close();
}
}