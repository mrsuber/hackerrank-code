import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the whatFlavors function below.
    static void whatFlavors(int[] cost, int money) {
        boolean loop = false;
        int x,y;
        int m = money;
        HashMap<Integer, Integer> element = new HashMap<Integer, Integer>();
        for(int i =0;i<cost.length;i++){
            x=cost[i];
            y=m-x;
            if(element.get(y)!=null){
                System.out.println((element.get(y))+" "+(i+1));
            }
            else element.put(x,(i+1));





            //this algorithm is n^2

            // for(int j = 1; j<cost.length; j++){
            //     if(cost[i]+cost[j]==money){
            //         System.out.println((i+1)+" "+(j+1));
            //             loop = true;
            //             break;
            //         }
            //     }
            //     if(loop==true){
            //     break;
            // }




            }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int money = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] cost = new int[n];

            String[] costItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int costItem = Integer.parseInt(costItems[i]);
                cost[i] = costItem;
            }

            whatFlavors(cost, money);
        }

        scanner.close();
    }
}
