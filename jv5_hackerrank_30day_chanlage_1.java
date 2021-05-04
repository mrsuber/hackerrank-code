import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class jv5_hackerrank_30day_chanlage_1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        System.out.print("Enter first int number:");
        int j = scan.nextInt();
        System.out.print("Enter first double number:");
        double f = scan.nextDouble();
        System.out.print("Enter first string:");
        String e = scan.nextLine();
        String e2 = scan.nextLine();
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        System.out.print(j+i+"\n");
        /* Print the sum of the double variables on a new line. */
		System.out.print(d+f);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.print("\n"+s + e2);
        scan.close();
    }
}
