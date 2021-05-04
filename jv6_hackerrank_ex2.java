import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class jv6_hackerrank_ex2 {

    public static void main(String[] args) {

      int firstelement = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("input the length of array");
      int array_length = sc.nextInt();
      int[] array_elements = new int[array_length];
      System.out.println("input the  array elements");
      for (int i =0;i<array_length;i++){
        int single_element = sc.nextInt();
        array_elements[i]  = single_element;
      }
      System.out.println("input Number of rotations");
      int rotation_number = sc.nextInt();


      int temp;
      for (int j = 0; j < rotation_number; j++){
        temp = array_elements[0];

        for (int i = 0; i < array_length - 1; i++)
            array_elements[i] = array_elements[i + 1];
        array_elements[array_length-1] = temp;

      }

      //
      // for(int d=0;d<=rotation_number;d++){
      //   for(int j = 0; j<rotation_number;j++){
      //     if(j==array_length){
      //       j=0;  }
      //       array_elements[0]=firstelement;
      //       array_elements[array_length-2]=array_elements[array_length-1];
      //       array_elements[array_length-1] = firstelement;

        //   }
        //
        // }




      sc.close();

         System.out.println( Arrays.toString(array_elements));




    }
}
