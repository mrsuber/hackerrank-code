import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class jv6_hackerrank_ex1 {

    public static void main(String[] args) {

       int[][] main = new int[6][6];
       int[][] main_array = {
           {-1 ,-1 ,0 ,-9, -2 ,-2},
           {-2 ,-1 ,-6 ,-8 ,-2 ,-5},
           {-1 ,-1, -1 ,-2 ,-3, -4},
           {-1 ,-9 ,-2 ,-4 ,-4 ,-5},
           {-7 ,-3, -3, -2, -9 ,-9},
           {-1 ,-3 ,-1 ,-2 ,-4 ,-5},
       };



       int answer = 0 ;
       int calculate = 0;
       int[] a = new int[16];


       //System.out.println("starting code 1 printing objects of innerarray");

       for (int i = 0; i < 4; ++i) {
              for(int j = 0; j<4; j++){
                calculate = main_array[i][j] + main_array[i][j+1] + main_array[i][j+2] + main_array[i+1][j+1] + main_array[i+2][j] + main_array[i+2][j+1] + main_array[i+2][j+2];
                // if (calculate > answer){
                //
                //   answer = calculate; }
                a[answer] = calculate;
                System.out.println(calculate);
                answer++;
              }
         }
         // if (answer < 0){System.out.print("negative number");}
         // else System.out.print("number is positve");
         Arrays.sort(a);
         System.out.println("Maximum = " + a[a.length-1]);
         System.out.println( Arrays.toString(a));



    }
}
