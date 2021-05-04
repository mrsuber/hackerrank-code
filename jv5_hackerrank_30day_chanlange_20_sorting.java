import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        boolean sorted = false;
        int temp;
        int round  = 1;
        int swaps =0;
        // System.out.print("original a: ");
        // for(int i:a){
        //         System.out.print(i + " ");
        //     }
        // System.out.println();
        while(!sorted) {
             sorted = true;

            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i+1]) {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    swaps++;
                    sorted = false;
                }
            }

            // System.out.print("round "+round+" a: ");
            // for(int i:a){
            //     System.out.print(i + " ");
            // }

    }
     System.out.print("Array is sorted in "+swaps+" swaps.");
        System.out.println();
        System.out.print("First Element: "+a[0]);
        System.out.println();
        System.out.print("Last Element: "+a[a.length-1]);
        System.out.println();
    }
}
