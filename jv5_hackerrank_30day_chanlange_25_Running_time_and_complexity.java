import java.util.Scanner;

import java.util.Scanner;

public class jv5_hackerrank_30day_chanlange_25_Running_time_and_complexity {

   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
    //    System.out.print("Enter a number : ");
        int p = s.nextInt();


    for(int v =0; v<p; v++){
        int n = s.nextInt();

       if (isPrime(n)) {
           System.out.println("Prime");
       } else {
           System.out.println("Not prime");
       }
   }
   }

   public static boolean isPrime(int n) {
       if (n <= 1) {
           return false;
       }
       for (int i = 2; i*i < =n; i++) {
           if (n % i == 0) {
               return false;
           }
       }
       return true;
   }
}
