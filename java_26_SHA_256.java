import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Java program to calculate SHA hash value

class java_26_SHA_256 {
    public static byte[] getSHA(String input) throws NoSuchAlgorithmException
    {
        // Static getInstance method is called with hashing SHA
        MessageDigest md = MessageDigest.getInstance("SHA-256");

        // digest() method called
        // to calculate message digest of an input
        // and return array of byte
        return md.digest(input.getBytes(StandardCharsets.UTF_8));
    }

    public static String toHexString(byte[] hash)
    {
        // Convert byte array into signum representation
        BigInteger number = new BigInteger(1, hash);

        // Convert message digest into hex value
        StringBuilder hexString = new StringBuilder(number.toString(16));

        // Pad with leading zeros
        while (hexString.length() < 32)
        {
            hexString.insert(0, '0');
        }

        return hexString.toString();
    }

    // Driver code
    public static void main(String args[])
    {
        try
        {
            System.out.println("HashCode Generated by SHA-256 for:");

            String s1 = "GeeksForGeeks";
            System.out.println("\n" + s1 + " : " + toHexString(getSHA(s1)));

            String s2 = "hello world";
            System.out.println("\n" + s2 + " : " + toHexString(getSHA(s2)));
        }
        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            System.out.println("Exception thrown for incorrect algorithm: " + e);
        }
    }
}

// 
//
//
//
// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;
//
// public class Solution {
//
//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//         try {
//             Scanner scanner = new Scanner( System.in );
//             String word = scanner.nextLine();
//             scanner.close();
//
//             MessageDigest messageDigest = MessageDigest.getInstance( "SHA-256" );
//             messageDigest.update( word.getBytes("UTF-8") );
//             byte[] byteHash = messageDigest.digest();
//
//             for ( byte b : byteHash ) {
//                 System.out.format( "%02x", b );
//             }
//
//         } catch ( Exception e ) {
//             e.printStackTrace();
//         }
//     }
// }