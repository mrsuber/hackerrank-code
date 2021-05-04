import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] Res = s.split("[\\p{Punct}\\s]+");
            System.out.println(Res.length);
        for (int i=0;i<Res.length;i++){
                System.out.println(Res[i]);
        }
        scan.close();
    }
}
