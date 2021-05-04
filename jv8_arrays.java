import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class jv8_arrays {

    public static void main(String[] args) {

    // create a 2d array
      int[][] a = {
          {1, 2, 3},
          {4, 5, 6, 9},
          {7},
      };

      int[][][] test = {
        {
          {1, -2, 3},
          {2, 3, 4}
        },
        {
          {-4, -5, 6, 9},
          {1},
          {2, 3}
        }} ;


      System.out.println("starting code 1 printing objects of innerarray");
      for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                System.out.println(a[i][j]);
            }
        }




        System.out.println("starting code 2 Printing elements of inner array version 2");
        // first for...each loop access the individual array
          // inside the 2d array
        for (int[] innerArray: a) {
            // second for...each loop access each element inside the row
            for(int data: innerArray) {
                System.out.println(data);
            }
        }
        System.out.println("starting code 3 printing length of innerarray");
      // calculate the length of each row
      System.out.println("Length of row 1: " + a[0].length);
      System.out.println("Length of row 2: " + a[1].length);
      System.out.println("Length of row 3: " + a[2].length);

      System.out.println("starting code 4 3d arrays");
      // for..each loop to iterate through elements of 3d array
       for (int[][] array2D: test) {
           for (int[] array1D: array2D) {
               for(int item: array1D) {
                   System.out.println(item);
               }
           }
       }
       System.out.println("starting code 5 copying arrays");
        int [] numbers = {1, 2, 3, 4, 5, 6};
        int [] positiveNumbers = numbers;    // copying arrays

        for (int number: positiveNumbers) {
            System.out.print(number + ", ");
        }
        System.out.print("\n");



    }
}
