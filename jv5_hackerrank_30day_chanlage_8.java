import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class jv5_hackerrank_30day_chanlage_8 {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.println("enter number of instance");

      int n= sc.nextInt();
      sc.nextLine();
      String[] strings = new String[n];
      String[] names = new String[n];
      // String[] st = new
      String s = "";
      String name = "";
        HashMap<String, String> magazines = new HashMap<String, String>();

      for (int j=0; j<n;j++){
        s = sc.nextLine();
        String[] string1 = s.split(" ", 2);
        magazines.put(string1[0], string1[1]);
        }

      // for (int i =0;i<strings.length;i++){
      //     String[] string1 = strings[i].split(" ", 2);
      //     magazines.put(string1[0], string1[1]);   }

      for (int t=0; t<n;t++){
        name = sc.nextLine();
        names[t] = name;  }


      for(int v=0;v<n;v++){
        if(magazines.get(names[v]) != null ){
          System.out.println(names[v] +"="+magazines.get(names[v]));
          }
          else System.out.println("Not found");
            }




      sc.close();


    }
}








// thie worked

//Complete this code or write your own from scratch
// import java.util.*;
// import java.io.*;
//
// class Solution{
//     public static void main(String []argh){
//         Scanner in = new Scanner(System.in);
//         int n = in.nextInt();
//         HashMap<String, Integer> magazines = new HashMap<String, Integer>();
//         for(int i = 0; i < n; i++){
//             String name = in.next();
//             int phone = in.nextInt();
//
//             magazines.put(name, phone);
//             // System.out.println(name + "="+ phone);
//             // Write code here
//         }
//         while(in.hasNext()){
//             String s = in.next();
//             if(magazines.get(s) != null){
//                 System.out.println(s +"="+magazines.get(s)); }
//             else{
//                 System.out.println("Not found");
//             }
//             // Write code here
//         }
//         in.close();
//     }
// }



















// String str = "key1=value1 key2=value2 key3=value3";
//playing with jv7_hashmaps
// Map<String, String> map = new HashMap<String, String>();
//
// String[] strArray = str.split(" ");
// for (int i = 0; i < strArray.length; i++) {
//
//     String data = strArray[i];
//
//
//     String[] keyValue = data.split("=");
//
//     map.put(keyValue[0], keyValue[1]);
//
// }
//
// System.out.println(map.get("key1"));
// System.out.println( Arrays.toString(strArray));
