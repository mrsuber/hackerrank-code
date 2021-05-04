import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'pairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    public static int pairs(int k, List<Integer> arr) {
    // Write your code here
    int count=0;
    int temp = 0;
    Map<Integer, Integer> myMap  = new HashMap<Integer, Integer>();
    for (int counter = 0; counter < arr.size(); counter++) {
        if(myMap.get(arr.get(counter))==null){
           myMap.put(arr.get(counter), 1);
        }
        else{
            myMap.put(arr.get(counter), myMap.get(arr.get(counter))+1);
        }

      }
    for (int counter = 0; counter < arr.size(); counter++) {
        temp = arr.get(counter)-k;
          if(myMap.get(temp)!=null){
              if(myMap.get(temp) >1){
                  myMap.put(temp,myMap.get(temp)-1);
              }
              else{
                  myMap.remove(temp);
              }
              count++;
          }
      }

      return count;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        int result = Result.pairs(k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
