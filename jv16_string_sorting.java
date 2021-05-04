import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class jv16_string_sorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String reverse = "";
        String original = in.next();
        String[] try1 = original.split("(?!^)", original.length());
        System.out.println("original string: "+original);
        // String original = "edcba";
        char[] chars = original.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);

        for (int i = try1.length - 1; i >= 0; i--){
            reverse = reverse+try1[i];
            // System.out.print(try1[i]);
    }
        System.out.println("sorted string: " +sorted);
        System.out.println("reverse string: " +reverse);

    }

}
