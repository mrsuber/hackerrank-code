import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'largestRectangle' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY h as parameter.
     */

    public static long largestRectangle(int[] h) {
    // Write your code here

        long max=0,minHeight=0,width=0;
        int lptr=0,rptr=0;
        for(int i=0; i<h.length ; i++)
        {
            minHeight = h[i];
            width=0;
            lptr = i;
            rptr = i;
            //left area
            while(lptr>=0 && (h[lptr] >= minHeight))
            {
                width++;
                lptr--;
            }

            //right area
            while(rptr<h.length && (h[rptr] >= minHeight))
            {
                width++;
                rptr++;
            }
            width -= 1;
            max = Math.max(max,(minHeight*width));
        }//
        return max;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] hTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        // List<Integer> h = new ArrayList<>();

        // for (int i = 0; i < n; i++) {
        //     int hItem = Integer.parseInt(hTemp[i]);
        //     h.add(hItem);
        // }

        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=Integer.parseInt(hTemp[i]);
        }

        long result = Result.largestRectangle(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
