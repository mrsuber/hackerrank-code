import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class jv6_hackerrank_ex30_abriviation {


    public static String abbreviation(String a, String b) {

    // Write your code here
    // Write your code here
        int n = a.length();
        int m = b.length();
        // boolean dp= new[n + 1][m + 1];
        boolean dp[][] = new boolean[n + 1][m + 1];

        dp[0][0] = true;
        for(int row = 1; row <= n; row++)
        {
            int i = row - 1;
            if(a.charAt(i) <= 90)break;
            else dp[row][0] = true;
        }

        for(int row = 1; row <= n; row++)
        {
            int i = row - 1;
            for(int col = 1; col <= m; col++)
             {
                int j = col - 1;
                if(a.charAt(i) == b.charAt(j)) dp[row][col] = dp[row-1][col-1];
                else if(a.charAt(i) <= 90) dp[row][col] = false;
                else if(a.charAt(i) - 32 == b.charAt(j)) dp[row][col] = (dp[row-1][col-1]|dp[row-1][col]);
                else dp[row][col] = dp[row-1][col];
            }
        }

        if(dp[n][m]) return "YES";
        else return "NO";
  }

        // int pos= 0;
        // System.out.println("Checking if len of A equal len of B");
        // if(a.length()==b.length()){
        //
        //     System.out.println(" len of A equal len of B -----true----");
        //     System.out.println(" converting all A to upper case-");
        //   a=a.toUpperCase();
        //   System.out.println(" comman A to upper case confirmed");
        //   System.out.println(" checking A equals B");
        //   if(a.equals(b)){
        //     System.out.println(" check complete -------true------");
        //     return "YES";
        //   }
        //   else{
        //     System.out.println(" check complete -------false------");
        //     return "NO";
        //   }
        // }
        //
        //
        //
        // else if(a.length()<b.length()){
        //     System.out.println(" len of A equal len of B -----false----");
        //     System.out.println("Checking if len of A is less than len of B");
        //     System.out.println(" len of A is less than len of B -----true----");
        //   return "NO";
        // }
        //
        //
        // else if(a.length()>b.length()){
        //     System.out.println(" len of A less len of B -----false----");
        //     System.out.println(" len of A equal len of B -----false----");
        //     System.out.println("Checking if length of a greater than length of b");
        //     System.out.println(" len of A is greater than len of B -----true----");
        //     // int pos= 0;
        //   for(int i =0;i<b.length();i++){
        //       System.out.println(" Getting  character "+(i+1)+" of String B");
        //         char charB = b.charAt(i);
        //         String Bchar = Character.toString(charB);
        //         System.out.println(" character "+(i+1)+" of String B:.."+Bchar);
        //
        //         while(pos<a.length()){
        //             System.out.println(" Getting character "+(pos+1)+" of String A");
        //             char charA = a.charAt(pos);
        //             String Achar = Character.toString(charA);
        //             System.out.println(" character "+(pos+1)+" of String A:..."+ Achar);
        //             System.out.println(" Checking if  character "+(pos+1)+" of String A equal  character "+(i+1)+" of String B");
        //             if(charB==charA){
        //                 System.out.println("  character "+(pos+1)+" of String A equal  character "+(i+1)+" of String B ------true----");
        //                 pos++;
        //                 break;
        //             }
        //
        //             else{
        //                 System.out.println("  character "+(pos+1)+" of String A equal  character "+(i+1)+" of String B ------false----");
        //                 System.out.println(" Checking if  character "+(pos+1)+" of String A is small letter");
        //                     if(charA >= 'a'&& charA<= 'z'){
        //                         System.out.println("  character "+(pos+1)+" of String A is small letter ------true-----");
        //                         System.out.println("  converting character "+(pos+1)+" of String A to capital leter");
        //                         String smallA = Character.toString(charA);
        //                         String aUpper=smallA.toUpperCase();
        //                         System.out.println("  character "+(pos+1)+" of String A successively converted form: " +smallA+ ":to: "+aUpper);
        //                         char Upper = aUpper.charAt(0);
        //                         System.out.println(" Checking if  character "+(aUpper)+" of String A equal  character "+(i+1)+" of String B");
        //                         if(charB==Upper){
        //                              System.out.println("  character "+(aUpper)+" of String A is equal to  character "+(i+1)+" of String B ------true-----");
        //                             pos++;
        //                             break;
        //                         }
        //
        //                         else{System.out.println("  character "+(aUpper)+" of String A is equal to  character "+(i+1)+" of String B ------false-----");
        //                             System.out.println("  removing character "+(pos+1)+" of String A ");
        //                             System.out.println("Old A: "+a);
        //                             a = a.replaceFirst(Character.toString(charA), "");
        //                             System.out.println("  removing complete ");
        //                             System.out.println("New A: "+a);
        //                             System.out.println("  Starting the program all over again ........ ");
        //                             String s =abbreviation(a,b);
        //                             if(s.equals("YES")){
        //                               return "YES";
        //                             }
        //                             else{
        //                               return "NO";
        //                             }
        //                             // continue;
        //                         }
        //                     }
        //                     else{
        //                             return "NO";
        //                     }
        //
        //             }
        //             //  pos++;
        //         }
        //     }
        // }
  //       System.out.println("  checking if the other element of A are small letters ");
  //       while(pos<a.length()){
  //           char charA = a.charAt(pos);
  //           String Achar = Character.toString(charA);
  //
  //           if(charA >= 'a'&& charA<= 'z'){
  //             System.out.println("  element of A are small letters: ----true---- ");
  //               pos++;
  //               continue;
  //
  //           }
  //           else return "NO";
  //       }
  //
  //       return "YES";
  // }


    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String a = scanner.nextLine();
            // scanner.nextLine();
            String b = scanner.nextLine();
            // System.out.println("before: "+a+" "+b);
            b = b.toUpperCase();
            // System.out.println("Process 1 .... second string becomes: "+a+" "+b);
            String result = abbreviation(a,b);
            // System.out.println("the final result is: "+result);
            System.out.println(result);

        }


        scanner.close();
    }
}
