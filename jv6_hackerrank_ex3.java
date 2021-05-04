import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class jv6_hackerrank_ex3 {

    public static void main(String[] args) {

      int [] q = {1, 2, 5, 3, 7, 8, 6, 4};
      // int [] q = {1,2,5 ,3, 4, 7, 8, 6};


      int totalBribes = 0;

   int expectedFirst = 1;
   int expectedSecond = 2;
   int expectedThird = 3;

   for ( int i = 0; i < q.length; ++i) {
       if (q[i] == expectedFirst) {
           expectedFirst = expectedSecond;
           expectedSecond = expectedThird;
           expectedThird++;
       } else if (q[i] == expectedSecond) {
           totalBribes++;
           expectedSecond = expectedThird;
           expectedThird++;
       } else if (q[i] == expectedThird) {
           totalBribes += 2;
           expectedThird++;
       } else {
           System.out.println("Too chaotic");
           return;
       }

   }
   System.out.println(totalBribes);








      //
      // for(int i =0; i<numbers.length;i++){
      //   if(numbers[i]== i+2){
      //     bribes++;
      //     }
      //   if(numbers[i]==i+3){
      //     bribes+=2;}
      //   if(numbers[i]>i+3){
      //     System.out.println("Too chaotic");
      //     return;
      //   }
      //
      //     }
      //     if (bribes >= 0){
      //           if ((numbers.length >= 3) && (numbers[numbers.length - 3] > numbers[numbers.length - 2]) && (numbers[numbers.length - 2] > numbers[numbers.length - 1]))
      //           {
      //               bribes++;
      //           }
      //           System.out.println(bribes);
      //         }
      //       else System.out.println(bribes);







    }
}
