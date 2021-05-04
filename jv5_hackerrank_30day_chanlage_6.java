import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class jv5_hackerrank_30day_chanlage_6 {

    public static void main(String[] args) {
      // char s = 'a';



      Scanner sc = new Scanner(System.in);
      System.out.println("input number of instances");
      int instance = sc.nextInt();
      String[] strArray3 = new String[instance];
      String s = "boygirl";
      String Odd= "";
      String even = "";

      for(int t =0 ; t<instance;t++){
        strArray3[t] = sc.next();


      }
      // System.out.println( Arrays.toString(strArray3));
      for (int i =0;i<instance;i++){
        // System.out.println(strArray3[i]);
        for(int j=0;j<strArray3[i].length(); j++){
          if(j%2==0){
            char c = strArray3[i].charAt(j);
            Odd+=Character.toString(c);

                }
          else{
            char b = strArray3[i].charAt(j);
             even+=Character.toString(b);

          }
        }

        System.out.println(even+" "+ Odd+" ");
        Odd = "";
        even = "";

      }




      // for (int j=0;j<instance;j++){

        // for(int t = 0; t<(strArray3[j]).length();t++){
        //   if (t+1 < (strArray3[j]).length()){
        //     System.out.print( ((strArray3[j]).charAt(t)) + " " ((strArray3[j]).charAt(t+1)) );
        //
        //   }
        //       System.out.print( ((strArray3[j]).charAt(t)) + " " ((strArray3[j]).charAt(t+1)) );
        //
        // }

      //
      //   System.out.print("\n");
      // }



      sc.close();


      // String[] strings = {"abc", "test", "123"};
      // char[][] charArraay = new char[strings.length][];
      // for(int i=0; i < strings.length; i++) {
      //   charArraay [i] = strings[i].toCharArray();
      //
      //   }
      //   System.out.println( Arrays.toString(charArraay[0]));


    }
}
