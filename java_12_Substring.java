import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String ans = "";

        String[] sa = S.split("(?!^)", S.length());
        for(int i=start;i<end;i++){
            ans=ans+sa[i];
        }
        System.out.println(ans);
    }

}
