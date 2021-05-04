import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class binary_tree {
    public static void main(String[] args){
      System.out.println("Starting Trees Tutorial");
      System.out.println("1.)------>");

      System.out.println("Taking in input 1");
      Scanner scanner = new Scanner(System.in);

      //catching errors code for input
      try{
          int n = Integer.parseInt(scanner.nextLine().trim());
          System.out.println("input1: "+ n);
          System.out.println("Declearing a 2D array of length "+n+" and 2");
          int[][] indexes = new int[n][2];


          System.out.println("Staring a loop that run for input 1 times ");

          for (int indexesRowItr = 0; indexesRowItr < n; indexesRowItr++) {
            System.out.println("enter number "+(indexesRowItr+1)+" String so that i save in array");
              String[] indexesRowItems = scanner.nextLine().split(" ");
              scanner.nextLine();

              for (int indexesColumnItr = 0; indexesColumnItr < 2; indexesColumnItr++) {
                System.out.println("Enter an interger ");

                  int indexesItem = Integer.parseInt(indexesRowItems[indexesColumnItr].trim());
                  indexes[indexesRowItr][indexesColumnItr] = indexesItem;
              }
          }
      }
      catch(Exception e) {
        System.out.println("Interger only as input");
  //  Block of code to handle errors
      }



    }

}
