import java.io.*;
import java.util.*;

public class java_11_String_introduction {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        // String myString = "Hello World!"
        int sum = A.length() + B.length();
        System.out.println(sum);
        /* Enter your code here. Print output to STDOUT. */
        // boolean order = false;
        int result = A.compareTo(B);

        if (result < 0)
        {
            // System.out.println("\"" + A + "\"" +  " is less than " +   "\"" + B + "\"");
            System.out.println("No");
        }
        else if (result == 0)
        {
            // System.out.println("\"" + A + "\"" +  " is equal to " +   "\"" + B + "\"");
            System.out.println("No");
        }
        else // if (result > 0)
        {
            // System.out.println("\"" + A + "\"" +    " is greater than " +   "\"" + B + "\"");
            System.out.println("Yes");
        }
         String upperCase = A.substring(0, 1).toUpperCase() + A.substring(1);
         String upperCase2 = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(upperCase + " "+ upperCase2);
    }
}
