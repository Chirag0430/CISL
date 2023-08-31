import java.util.HashMap;
import java.util.Map;

public class Assignment_4_substitution {
    public static void main(String[] args) {
        String allLetters = "abcdefghijklmnopqrstuvwxyzABCDEFGHI" + "JKLMNOPQRSTUVWXYZ";
        Map<Character, Character> dict1 = new HashMap<>();
        int key = 4;
        for (int i = 0; i < allLetters.length(); i++) {
            dict1.put(allLetters.charAt(i),
                    allLetters.charAt((i + key) % allLetters.length()));
        }
        String plainText = "I am studying Data Encryption";
        StringBuilder cipherText = new StringBuilder();
        for (char c : plainText.toCharArray()) {
            if (allLetters.indexOf(c) != -1) {
                cipherText.append(dict1.get(c));
            } else {
                cipherText.append(c);
            }
        }
        System.out.println("Cipher Text is: " + cipherText);
        Map<Character, Character> dict2 = new HashMap<>();
        for (int i = 0; i < allLetters.length(); i++) {
            dict2.put(allLetters.charAt(i),
                    allLetters.charAt((i - key + allLetters.length()) % allLetters.length()));
        }
        StringBuilder decryptedText = new StringBuilder();
        for (char c : cipherText.toString().toCharArray()) {
            if (allLetters.indexOf(c) != -1) {
                decryptedText.append(dict2.get(c));
            } else {
                decryptedText.append(c);
            }
        }
        System.out.println("Recovered plain text: " + decryptedText);
    }
}