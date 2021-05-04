import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class jv6_hackerrank_ex4_arrayswap {

    public static void main(String[] args) {

      int [] arr = {1, 2, 3, 4, 5, 6, 8, 7};

      int c=0;
      int a=0;
      int  n=arr.length;

      for(int i=0;i<n;i++)
        {
          if(arr[i]==(i+1)){
            continue;
            }
          else {
            a=arr[i];
            arr[i]=arr[a-1];
            arr[a-1] = a;
            // swap(arr[i],arr[arr[i]-1]);

          }
          c++;
          i--;
    }
    System.out.println( Arrays.toString(arr));
    System.out.println(c);








    }
}
