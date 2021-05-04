import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class jv5_hackerrank_30day_chanlage_7 {

    public static void main(String[] args) {
      int [] q = {1, 2, 3, 4, 5, 6, 7, 8};
      int n = 8;
      int[] c = new int[n];

      for(int i =0;  i<n; i++){
        c[i] = q[n-(i+1)];

      }
      System.out.println( Arrays.toString(c));




    }
}
