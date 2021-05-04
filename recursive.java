
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class recursive {

    static int recursiveFuntion(int n, Integer[] memo){
      if(memo[n]!=null){
        return memo[n];

      }
      else{
        int result=0;

        if(n==0){
          result = 0;
        }
        else if (n==1){
          result = 1;
        }
        else if(n==2) {
          result = 1;
        }
        else if(n>2){
          result= recursiveFuntion(n-1,memo) +recursiveFuntion(n-2,memo);
        }
        memo[n]=result;
        return result;
      }

    }



    public static void main(String[] args)
    {
      Scanner scanner = new Scanner(System.in);

      //catching errors code for input

          int n = Integer.parseInt(scanner.nextLine().trim());
          Integer[] memo = new Integer[n+1];

          for(int i=0 ;i<=n;i++){
            System.out.println(i+" ; "+recursiveFuntion(i,memo));
          }
          // System.out.println(res);
    }


}
