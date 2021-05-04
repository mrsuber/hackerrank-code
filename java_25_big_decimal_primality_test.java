import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();

        scanner.close();

      BigInteger b = new BigInteger(n);

      if(b.isProbablePrime(1)== true){
          System.out.println("prime");
      }
      else{
          System.out.print("not prime");
      }


    }
}
