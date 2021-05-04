import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class jv5_hackerrank_30day_chanlage_13 {


    public static void main(String[] args) {
      ArrayList<Integer> arr=new ArrayList<Integer>();
      // arr.add(1);
      // arr.add(2);
      // arr.add(2);
      // arr.add(4);
      // arr.add(27);
      // arr.add(81);

      // long r = 2;

      Map<Long, Long> leftMap = new HashMap<>();
      Map<Long, Long> rightMap = new HashMap<>();

      Scanner scanner = new Scanner(System.in);
      int numb = scanner.nextInt();
      long r = scanner.nextInt();
      for(int i=0; i<numb;i++){
        arr.add(scanner.nextInt());
      }

      for (long item : arr) {
        if(rightMap.get(item) ==null){
          rightMap.put(item,  0L + 1);
        }
        else{
          rightMap.put(item, rightMap.get(item) + 1);
        }

      }

      long count = 0;

      for (int i = 0; i < arr.size(); i++) {
        long midTerm = arr.get(i);
        long c1 = 0, c3 = 0;
        if(rightMap.get(midTerm) ==null){
          rightMap.put(midTerm,  0L - 1);
        }
        else{
          rightMap.put(midTerm, rightMap.get(midTerm) - 1);
        }


        // rightMap.put(midTerm, rightMap.getOrDefault(midTerm, 0L) - 1);

        if (leftMap.containsKey(midTerm / r) && midTerm % r == 0) {
          c1 = leftMap.get(midTerm / r);
        }

        if (rightMap.containsKey(midTerm * r))
          c3 = rightMap.get(midTerm * r);

        count += c1 * c3;
        if(leftMap.get(midTerm) ==null){
          leftMap.put(midTerm,  0L + 1);
        }
        else{
          leftMap.put(midTerm, leftMap.get(midTerm) + 1);
        }


        // leftMap.put(midTerm, leftMap.getOrDefault(midTerm, 0L) + 1);

      }
    System.out.println(count);


    }
}
