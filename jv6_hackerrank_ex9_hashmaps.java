import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class jv6_hackerrank_ex9_hashmaps {
//ex 8 is jv5_hackerrank_30day_chanlage_13
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // System.out.println("enter number of instance");
      int n= sc.nextInt();
      int num1 = 0;
      int num2 = 0;
      int freq =0;
      int count = 0;

      HashMap<Integer, Integer> element = new HashMap<Integer, Integer>();
      HashMap<Integer, Integer> frequency = new HashMap<Integer, Integer>();


      for (int j=0; j<n;j++){
          num1 = sc.nextInt();
          num2 = sc.nextInt();
          //storing the key(wether the number should be added, or remove or print)
          //and the value is the number whose ocurance should behave like the key.
          if(num1==1){
              if(element.get(num2)==null){
                element.put(num2, 1);
                if (frequency.get(1)!=null){
                  frequency.put(1,frequency.get(1)+1 );
                }
                else{frequency.put(element.get(num2), 1);}

                }
              else{
                    element.put(num2, element.get(num2)+1);
                    if (frequency.get(element.get(num2))!=null){
                      frequency.put(element.get(num2),  frequency.get(element.get(num2))+1);
                    }
                    else{ frequency.put(element.get(num2),  1);}
                    // frequency.put(element.get(num2),  1);


                }
              }

          if(num1==2){
              if(element.get(num2)==null){
                continue;
                }
              else{

                frequency.put(frequency.get(element.get(num2)),  frequency.get(element.get(num2))-1);
                element.put(num2, element.get(num2)- 1);

                }
              }

          if(num1==3){

              if(frequency.get(num2)!=null  &&frequency.get(num2)>0){

                  System.out.println(1);

                }
                else System.out.println(0);

                }






      }

      System.out.println(element );
      System.out.println(frequency);
      sc.close();


    }
}



// 
// //this one works:
// #include<bits/stdc++.h>
// using namespace std;
//
// int main(){
//     ios_base::sync_with_stdio(false);
//     cin.tie(0);
//     int nq;
//     cin>>nq;
//
//     // first will contain <element, frequency> pairs
//     map<int,int> first;
//     // second will contain <frequency, frequencyCount> pairs
//     map<int,int> second;
//
//     for(int i=0; i<nq; i++){
//
//         int a, b;
//
//         cin >>a >>b;
//
//         if(a == 1) {
//             // Insert b into first map.
//             // Update the frequencies in second map.
//             int elem = first[b];    // ele = current frequency of element b.
//
//             if(elem > 0) {
//                 // b was already present.
//                 second[elem]--;
//             }
//
//             // Add b
//             // increase frequency of b
//             first[b]++;
//
//             // Update the count of new frequency in second map
//             second[first[b]]++;
//         }
//
//         else if(a == 2) {
//             // Remove b
//             int temp = first[b];    // temp = current frequency of element b
//             if(temp > 0){
//                 // b is present
//                 second[temp]--; // Update frequency count
//                 first[b]--;     // decrease element frequency
//                 second[first[b]]++; // Update frequency count
//             }
//         }
//         else {
//             // check for the b frequency of any element
//             int res = second[b];
//             if(res > 0) {
//                 cout<<1<<endl;
//             }
//             else {
//                 cout<<0<<endl;
//             }
//         }
//     }
//     return 0;
// }




// #include <bits/stdc++.h>
// using namespace std;
// int main()
// {
//     int q;
//     long x,y;
//     cin>>q;
//     unordered_map<long,long>first,second;
//     while(q--)
//     {
//         cin>>x>>y;
//
//         if(x==1){
//             if(first[y]){
//                 second[first[y]]--;
//             }
//             first[y]++;
//             second[first[y]]++;
//         }
//
//         else if(x==2){
//             second[first[y]]--;
//             first[y]--;
//             second[first[y]]++;
//
//         }
//         else{
//             if(second[y]){
//                 cout<<"1"<<endl;
//             }
//             else{
//                 cout<<"0"<<endl;
//             }
//
//         }
//     }
//     return 0;
// }
