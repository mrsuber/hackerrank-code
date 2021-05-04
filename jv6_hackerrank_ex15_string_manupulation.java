import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {

      int counter = 0;
      int result =0;
      String[] sa = a.split("(?!^)", a.length());
      String[] sb = b.split("(?!^)", b.length());
    if(a.length()>b.length()){
        HashMap<String, Integer> magazines = new HashMap<String, Integer>();
        for(int i=0; i<sa.length;i++){
            if( magazines.get(sa[i]) != null){
                magazines.put(sa[i], magazines.get(sa[i]) + 1);
            }
            else  magazines.put(sa[i], 1 );
        }

        for(int t=0; t<sb.length; t++){

          if(magazines.get(sb[t]) != null   && magazines.get(sb[t])>0 ){
            counter++;
            magazines.put(sb[t], magazines.get(sb[t]) - 1);


            }
          else continue;

        }
        result=(a.length()-counter)+(b.length()-counter);
        return result;
    }
    if(a.length()<b.length()){
        HashMap<String, Integer> magazines = new HashMap<String, Integer>();
        for(int i=0; i<sb.length;i++){
            if( magazines.get(sb[i]) != null){
                magazines.put(sb[i], magazines.get(sb[i]) + 1);
            }
            else  magazines.put(sb[i], 1 );
        }

        for(int t=0; t<sa.length; t++){

          if(magazines.get(sa[t]) != null   && magazines.get(sa[t])>0 ){
            counter++;
            magazines.put(sa[t], magazines.get(sa[t]) - 1);


            }
          else continue;

        }
        result=(a.length()-counter)+(b.length()-counter);
        return result;
    }
    else{
        HashMap<String, Integer> magazines = new HashMap<String, Integer>();
        for(int i=0; i<sb.length;i++){
            if( magazines.get(sb[i]) != null){
                magazines.put(sb[i], magazines.get(sb[i]) + 1);
            }
            else  magazines.put(sb[i], 1 );
        }

        for(int t=0; t<sa.length; t++){

          if(magazines.get(sa[t]) != null   && magazines.get(sa[t])>0 ){
            counter++;
            magazines.put(sa[t], magazines.get(sa[t]) - 1);


            }
          else continue;

        }
        result=(a.length()-counter)+(b.length()-counter);
        return result;

    }





    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
