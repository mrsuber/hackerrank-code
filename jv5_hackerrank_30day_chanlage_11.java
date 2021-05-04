import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class jv5_hackerrank_30day_chanlage_11 {



    public static void main(String[] args)  {

        int[] m = new int[16];
        int[][] main_array= {
        //   {0 ,-4 ,-6 ,0 ,-7 ,-6},
        //   {-1 ,-2 ,-6 ,-8 ,-3 ,-1},
        //   {-8 ,-4 ,-2 ,-8 ,-8 ,-6},
        //   {-3 ,-1 ,-2 ,-5 ,-7 ,-4},
        //   {-3 ,-5 ,-3 ,-6 ,-6 ,-6},
        //   {-3 ,-6 ,0 ,-8 ,-6 ,-7}
        {1, 1, 1, 0, 0, 0},

        {0, 1, 0, 0, 0, 0},

        {1, 1, 1, 0, 0, 0},

        {0, 0, 2, 4, 4, 0},

        {0, 0, 0, 2, 0, 0},

        {0, 0, 1, 2, 4, 0}
        };

        int answer = 0;
        int calculate =0;

        for (int i = 0; i < 4; ++i) {
              for(int j = 0; j<4; j++){
                calculate = main_array[i][j] + main_array[i][j+1] + main_array[i][j+2] + main_array[i+1][j+1] + main_array[i+2][j] + main_array[i+2][j+1] + main_array[i+2][j+2];
                m[answer] = calculate;
                answer++;


              }



         }
          Arrays.sort(m);
         System.out.println( m[m.length-1]);
         // System.out.println( Arrays.toString(m));


    }
}
