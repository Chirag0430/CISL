import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class Assignment_6_DES {
    public static void main(String[] args) throws Exception {
        // Initialize a text to be encrypted
        String originalText = "Hello, DES encryption!";
        System.out.println("Original Text: " + originalText);

        // Generate a DES key
        KeyGenerator keyGen = KeyGenerator.getInstance("DES");
        SecretKey desKey = keyGen.generateKey();

        // Create a DES cipher for encryption
        Cipher desCipher = Cipher.getInstance("DES");
        desCipher.init(Cipher.ENCRYPT_MODE, desKey);

        // Encrypt the text
        byte[] encryptedBytes = desCipher.doFinal(originalText.getBytes());

        // Encode the encrypted bytes to Base64 for storage or transmission
        String encryptedText = Base64.getEncoder().encodeToString(encryptedBytes);
        System.out.println("Encrypted Text: " + encryptedText);

        // Create a DES cipher for decryption
        desCipher.init(Cipher.DECRYPT_MODE, desKey);

        // Decrypt the encrypted text
        byte[] decryptedBytes = desCipher.doFinal(Base64.getDecoder().decode(encryptedText));
        String decryptedText = new String(decryptedBytes);

        System.out.println("Decrypted Text: " + decryptedText);
    }
}
