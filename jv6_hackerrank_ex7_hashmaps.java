import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class jv6_hackerrank_ex7_hashmaps {

    public static void main(String[] args) {
      // Create a HashMap object called capitalCities
      Scanner sc = new Scanner(System.in);
      System.out.println("enter number of instance");
      String output = "NO";
      int n= sc.nextInt();
        HashMap<String, Integer> magazines = new HashMap<String, Integer>();

      for (int j=0; j<n;j++){
        System.out.println("enter String to compare");
        // String sx = sc.nextLine();
        String s = sc.next();
        int s_len = s.length();
        String s1 = sc.next();
        int s1_len = s1.length();

        // s.split("(?!^)");
        String[] string1 = s.split("(?!^)", s_len);
        String[] string2= s1.split("(?!^)", s1_len);

        for(int i=0; i<s_len;i++){
          if( magazines.get(string1[i]) != null){
            magazines.put(string1[i], magazines.get(string1[i]) + 1);}
          else  magazines.put(string1[i], 1 );
          }

        for(int t=0; t<s1_len; t++){
            if(magazines.get(string2[t]) != null ){
              output = "Yes";
              break;
              }

            else continue;
          }



          System.out.println(output);
      }


      sc.close();




    }
}
