import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class jv6_hackerrank_ex6_hashmaps {

    public static void main(String[] args) {
      // Create a HashMap object called capitalCities



      Scanner sc = new Scanner(System.in);
      System.out.println("enter number");

      int m_number= sc.nextInt();
      int n_number= sc.nextInt();
      System.out.println("enter String");
      String sx = sc.nextLine();
      String s = sc.nextLine();

      String s1 = sc.nextLine();


      int counter = 0;
      String[] magazine = s.split(" ", m_number);
      String[] note = s1.split(" ", n_number);

      HashMap<String, Integer> magazines = new HashMap<String, Integer>();
      for(int i=0; i<magazine.length;i++){
        if( magazines.get(magazine[i]) != null){
          magazines.put(magazine[i], magazines.get(magazine[i]) + 1);
        }
        else  magazines.put(magazine[i], 1 );
      }

      System.out.println("Initial Mappings are: " + magazines);
      for(int t=0; t<note.length; t++){

          if(magazines.get(note[t]) != null   && magazines.get(note[t])>0 ){
            counter++;
            magazines.put(note[t], magazines.get(note[t]) - 1);


            }
          else continue;

        }
        if (counter==note.length){
          System.out.println("Yes");   }
        else {
          System.out.println("No");}

    sc.close();



    }
}








//
// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;
//
// public class jv6_hackerrank_ex6_hashmaps {
//
//     public static void main(String[] args) {
//       // Create a HashMap object called capitalCities
//
//
//
//       Scanner sc = new Scanner(System.in);
//       System.out.println("enter number");
//
//       int m_number= sc.nextInt();
//       int n_number= sc.nextInt();
//       System.out.println("enter String");
//       String sx = sc.nextLine();
//       String s = sc.nextLine();
//
//       String s1 = sc.nextLine();
//
//
//       int counter = 0;
//       String[] magazine = s.split(" ", m_number);
//       String[] note = s1.split(" ", n_number);
//
//       HashMap<Integer, String> magazines = new HashMap<Integer, String>();
//       for(int i=0; i<magazine.length;i++){
//         magazines.put(i+1, magazine[i]);
//       }
//       HashMap<Integer, String> notes = new HashMap<Integer, String>();
//       for(int j=0; j<note.length;j++){
//         notes.put(j+1, note[j]);
//       }
//
//
//       for(int t=0; t<note.length; t++){
//         for(int v=1; v<=magazines.size();v++){
//           if(note[t].equals(magazines.get(v))  ){
//             counter++;
//
//             magazines.remove(magazines.get(v));
//
//             break;
//             }
//           else continue;
//         }
//         }
//         if (counter==notes.size()){
//           System.out.println("Yes");   }
//         else {
//           System.out.println("No");}
//
//     sc.close();
//
//
//
//     }
// }
