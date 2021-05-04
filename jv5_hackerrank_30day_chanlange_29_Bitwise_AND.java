import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'bitwiseAnd' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER N
     *  2. INTEGER K
     */



}

public class Solution {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int a0 = 0; a0 < t; a0++){
        int n = in.nextInt();
        int k = in.nextInt();
        int finalResult = 0;
        for(int i = 1; i < n ; i++){
            for(int j = i+1; j <= n ; j++){
                int amp = i&j;
                if(amp < k && amp > finalResult)
                    finalResult = amp;
            }
        }
        System.out.println(finalResult);
    }



    }
}
