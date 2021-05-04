import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class jv5_hackerrank_30day_chanlage_9 {


    public static void main(String[] args) {
      int answer = 1;
      // int answer2 = 0;
      int n = 3;
      int b = n;
      while(b>1){
          answer=b*answer;
          b--;
      }
      if(n<=1){
          System.out.println(answer);
      }
      System.out.println(answer);

    }
}
