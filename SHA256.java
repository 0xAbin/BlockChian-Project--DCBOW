import java.security.messageDigest;

public class StringUtil {
    public static String applySha256(String input){
        try {
            messageDigest digest = messageDigest.get.getInstance("SHA-256");

            byte[] hash = digest.digest(input.getBytes("UTF-8"));
            StringBuffer hexString = new StringBuffer();

            for(int i =0; i< hash.length; i++)
            String hex =Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1) hexString.apend('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }
    catch(Exception e) {
        throw new RunTimeException();
    }
}