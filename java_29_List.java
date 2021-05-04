import java.util.Scanner;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        /* Create and fill Linked List of Integers */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            int value = scan.nextInt();
            list.add(value);
        }

        /* Perfrom queries on Linked List */
        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            String action = scan.next();
            if (action.equals("Insert")) {
                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index, value);
            } else { // "Delete"
                int index = scan.nextInt();
                list.remove(index);
            }
        }
        scan.close();

        /* Print our updated Linked List */
        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
}


// // Java code to illustrate add(int index, E elements)
// import java.io.*;
// import java.util.*;
//
// public class java_29_List {
//     public static void main(String[] args)
//     {
//       //declear a scanner to take in first entry length of array list.
//       Scanner in = new Scanner(System.in);
//        int length_list = in.nextInt();
//
//         // create an empty list with an initial capacity
//         List<Integer> list = new ArrayList<Integer>(length_list);
//         //populating the List
//         for(int i=0; i<length_list;i++){
//           // use add() method to initially
//           // add elements in the list
//
//           list.add(in.nextInt());
//
//         }
//         //getting the number of queries to be performed on List
//         //take in number of queris
//         int queris = in.nextInt();
//         in.nextLine();
//         for(int i=0; i<queris; i++){
//           String first = in.nextLine();
//
//           if(first.equals("Insert")){
//             int x= in.nextInt();
//             int y= in.nextInt();
//             list.add(x,y);
//           }
//           if(first.equals("Delete")){
//             int x = in.nextInt();
//             list.remove(x);
//           }
//         }
//         //
//         // // Add a new element at index 0
//         // list.add(0, "Hello");
//
//         // prints all the elements available in list
//         for (Integer str : list) {
//             System.out.print(str + " ");
//         }
//     }
// }
