import javax.crypto.cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.sceretkey;
Public class BlowFish Example
{
String text="Hello World";
keyGenerator keyGen=KeyGenerator.get instance("BlowFish");
keyGen.init(128);
sceretkey key=keyGen.generate key();
cipher cipher=cipher.get instance("BlowFish");
cipher .init(cipher.Encrypt_mode,key);
byte[]encrypted=cipher.dofinal(text.get bytes());
cipher.init(cipher.Decrypt_mode,key);
byte[]decrypted=cipher.doFinal(encrypted);
System.out.println("original text:"=text);
System.out.print("encrypted text");
for(byte b:encrypted)
{
System.out.printf("%02x",b);
}
System.out.println();
System.out.println("Decrypted Text:"+newstring(decrypted));
}
}