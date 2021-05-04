import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class jv5_hackerrank_30day_chanlage_3 {

    public static void main(String[] args) {
      int n = 24;

      if(n%2 == 1){System.out.print("Weird"+"\n");}

      if(n%2 == 0){
        if(Math.max(2, n) == Math.min(n, 5)){
          System.out.print("Not Weird"+ "\n");
          }
        }
      if(n%2 == 0){
        if(Math.max(6, n) == Math.min(n, 20)){System.out.print("Weird"+ "\n");}
      }
      if(n%2 == 0){
        if(n>=20){System.out.print("Not Weird"+ "\n");}
      }



    }
}
