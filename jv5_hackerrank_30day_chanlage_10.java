import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class jv5_hackerrank_30day_chanlage_10 {


    public static void main(String[] args) {



      // I figured it out, here is the solution. I have forgotten an nested if statement.

      Scanner scanner = new Scanner(System.in);
      int numb = scanner.nextInt();
      int tempCount = 0; //save temporarily the longest sequence of one's in this variable
      int count = 0; // before the sequence of one's gets interrupted, I save the value from tempCount in count

      // numb = 439 -> output 3
      // numb = 13  -> output 2
      // numb = 1   -> output 1
      while (numb >= 1) {

          if (numb % 2 != 0) {

              tempCount++;
              numb /= 2;
              if(count < tempCount){
                  count = tempCount;
              }

          }
          else {
              numb /= 2;
              tempCount = 0;
          }
      }
      System.out.println(count);





























      // int quotient;
      // int remainder;
      //
      // Scanner keyboard = new Scanner (System.in);
      //   System.out.println("Please enter a decimal number:");
      //   quotient = keyboard.nextInt();
      //
      //   do {
      //       remainder = quotient % 2;
      //
      //       // String x = String.valueOf(remainder);
      //       // System.out.print(x);
      //       System.out.println (remainder);
      //
      //   } while ((quotient /= 2) != 0);

    }
}
