import java.security.MessageDigest;

public class Assignment_10_MD5 {
    public static String calculateDigest(String text) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(text.getBytes());
        byte[] digest = md.digest();
        return bytesToHex(digest);
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        String text = "This is the text to calculate the MD5 digest of.";
        String digest = calculateDigest(text);

        System.out.println("The MD5 digest of the text is: " + digest);
    }
}
