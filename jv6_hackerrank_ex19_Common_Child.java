import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class jv6_hackerrank_ex19_Common_Child {

    // Complete the commonChild function below.
    static int commonChild(String a, String b) {
        // int counter = 0;
        // int result =0;
        // String[] sa = s1.split("(?!^)", s1.length());
        // String[] sb = s2.split("(?!^)", s2.length());

        // if(sa.length==sb.length){
        //     for (int i =0; i<sa.length; i++){
        //         for(int j =0; j<sb.length; j++){
        //             if(sa[i].equals(sb[j])){
        //                 counter++;
        //                 sb[j]="1";
        //                 sa[i]="2";
        //             }
        //         }
        //     }
        //     return counter;
        // }



        // if(sa.length>sb.length){
        //     for (int i =0; i<sa.length; i++){
        //         for(int j =0; j<sb.length; j++){
        //             if(sa[i].equals(sb[j])){
        //                 counter++;
        //                 sb[j]="3";
        //                 sa[i]="4";
        //             }
        //         }
        //     }
        //     return counter;
        // }



        // if(sa.length<sb.length){
        //     for (int i =0; i<sb.length; i++){
        //         for(int j =0; j<sa.length; j++){
        //             if(sb[i].equals(sa[j])){
        //                 counter++;
        //                 sb[j]="5";
        //                 sa[i]="6";
        //             }
        //         }
        //     }
        //     return counter;
        // }

    //     if(s1.length()==s2.length()){

    //         HashMap<String, Integer> magazines = new HashMap<String, Integer>();
    //         for(int i=0; i<sa.length;i++){
    //             if( magazines.get(sa[i]) != null){
    //                 magazines.put(sa[i], magazines.get(sa[i]) + 1);
    //             }
    //              else  magazines.put(sa[i], 1 );
    //          }

    //         for(int t=0; t<sb.length; t++){

    //             if(magazines.get(sb[t]) != null   && magazines.get(sb[t])>0 ){
    //                 counter++;
    //                 magazines.put(sb[t], magazines.get(sb[t]) - 1);

    //                 // System.out.println("later "+sb[t]+" exits in hashmap");
    //             }
    //             if(magazines.get(sb[t])==null){
    //                 continue;
    //             }

    //         }
    //         // System.out.println(magazines);
    //     return counter;
    // }


    // if(s1.length()>s2.length()){

    //         HashMap<String, Integer> magazines = new HashMap<String, Integer>();
    //         for(int i=0; i<sa.length;i++){
    //             if( magazines.get(sa[i]) != null){
    //                 magazines.put(sa[i], magazines.get(sa[i]) + 1);
    //             }
    //              else  magazines.put(sa[i], 1 );
    //          }

    //         for(int t=0; t<sb.length; t++){

    //             if(magazines.get(sb[t]) != null   && magazines.get(sb[t])>0 ){
    //                 counter++;
    //                 magazines.put(sb[t], magazines.get(sb[t]) - 1);

    //                 // System.out.println("later "+sb[t]+" exits in hashmap");
    //             }
    //             if(magazines.get(sb[t])==null){
    //                 continue;
    //             }

    //         }
    //         // System.out.println(magazines);
    //     return counter;
    // }

    // if(s1.length()<s2.length()){

    //         HashMap<String, Integer> magazines = new HashMap<String, Integer>();
    //         for(int i=0; i<sb.length;i++){
    //             if( magazines.get(sb[i]) != null){
    //                 magazines.put(sb[i], magazines.get(sb[i]) + 1);
    //             }
    //              else  magazines.put(sb[i], 1 );
    //          }

    //         for(int t=0; t<sa.length; t++){

    //             if(magazines.get(sa[t]) != null   && magazines.get(sa[t])>0 ){
    //                 counter++;
    //                 magazines.put(sa[t], magazines.get(sa[t]) - 1);

    //                 // System.out.println("later "+sb[t]+" exits in hashmap");
    //             }
    //            if(magazines.get(sb[t])==null){
    //                 continue;
    //             }

    //         }
    //         // System.out.println(magazines);
    //     return counter;
    // }
    // return counter;


         int[][] C = new int[a.length()+1][b.length()+1];

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    System.out.print(C[i+1][j+1]);
                    System.out.println();
                    System.out.print(C[i][j] + 1);
                    C[i+1][j+1] = C[i][j] + 1;

                } else {
                    C[i+1][j+1] = Math.max(C[i+1][j], C[i][j+1]);
                }
            }
        }
        System.out.println( C[a.length()][b.length()]);
        return C[a.length()][b.length()];


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)/* throws IOException*/ {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        int result = commonChild(s1, s2);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedWriter.close();

        scanner.close();
    }
}
