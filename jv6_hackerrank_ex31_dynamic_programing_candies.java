import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'candies' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

}

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();

        int[] children = new int[length];
        int[] candies = new int[length];

        // seed
        children[0] = scan.nextInt();
        candies[0] = 1;

        // search forward sequences
        for (int i = 1; i < length; i++){
                children[i] = scan.nextInt();
                candies[i] = 1;
                if (children[i] > children[i - 1])
                    candies[i] = candies[i - 1] + 1;
        }

        // search reverse sequences
        for (int i = length - 1; i > 0; i--){
                if (children[i] < children[i - 1])
                    candies[i - 1] = Math.max(candies[i - 1], candies[i] + 1);
        }

        long sum = 0;
        for (int i= 0; i < candies.length; i++){
                sum += candies[i];
            }

        System.out.println(sum);
            }
}
