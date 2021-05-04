import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
    // Write your code here
    int n = -1;
    while (s.length() != n) {
        n = s.length();
        s = s.replace("()", "");
        s = s.replace("[]", "");
        s = s.replace("{}", "");
    }
    if (s.length() == 0)
        return "YES";
    else
        return "NO";

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String s = bufferedReader.readLine();

            String result = Result.isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}






// 
//
//
//
//
//
//
//
// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.regex.*;
//
// class Result {
//
//     /*
//      * Complete the 'isBalanced' function below.
//      *
//      * The function is expected to return a STRING.
//      * The function accepts STRING s as parameter.
//      */
//
//     public static String isBalanced(String s) {
//     // Write your code here
//         Stack<Integer> st =new Stack<Integer>();
//         char a[]=s.toCharArray();
//         int comp=0;
//         for(int i=0;i<s.length();i++){
//             if(i>0 && !st.isEmpty()){comp=st.peek();}
//                 st.push((int) a[i]);
//                 if(comp!=0 && !st.isEmpty() && st.size()>1){
//                     if((comp==91 && st.peek()==93)||(comp==123 && st.peek()==125)||(comp==40 && st.peek()==41)){
//                         st.pop();st.pop();}
//                 }
//         }
//             if(st.isEmpty()){return("YES");}
//             else{return("NO");}
//
//     }
//
// }
//
// public class Solution {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//         BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//         int t = Integer.parseInt(bufferedReader.readLine().trim());
//
//         for (int tItr = 0; tItr < t; tItr++) {
//             String s = bufferedReader.readLine();
//
//             String result = Result.isBalanced(s);
//
//             bufferedWriter.write(result);
//             bufferedWriter.newLine();
//         }
//
//         bufferedReader.close();
//         bufferedWriter.close();
//     }
// }
