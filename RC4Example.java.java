import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class RC4Example {

    public static void main(String[] args) throws Exception {

        String plaintext = "Hello World";

        // Generate RC4 key
        KeyGenerator keyGen = KeyGenerator.getInstance("RC4");
        keyGen.init(128);
        SecretKey key = keyGen.generateKey();

        // Create RC4 cipher
        Cipher cipher = Cipher.getInstance("RC4");

        // Encrypt the plaintext
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encrypted = cipher.doFinal(plaintext.getBytes());

        // Decrypt the ciphertext
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decrypted = cipher.doFinal(encrypted);

        // Display original text
        System.out.println("Original text: " + plaintext);

        // Display encrypted text in hexadecimal
        System.out.print("Encrypted text: ");
        for (byte b : encrypted) {
            System.out.printf("%02x", b);
        }

        System.out.println();

        // Display decrypted text
        System.out.println("Decrypted text: " + new String(decrypted));
    }
}