import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class jv6_hackerrank_ex11_sorting {

  public static void merge(int[] left_arr,int[] right_arr, int[] arr,int left_size, int right_size){

      int i=0,l=0,r = 0;
      //The while loops check the conditions for merging
      while(l<left_size && r<right_size){

          if(left_arr[l]<right_arr[r]){
              arr[i++] = left_arr[l++];
          }
          else{
              arr[i++] = right_arr[r++];
          }
      }
      while(l<left_size){
          arr[i++] = left_arr[l++];
      }
      while(r<right_size){
        arr[i++] = right_arr[r++];
      }
  }

  public static void mergeSort(int [] arr, int len){
      if (len < 2){return;}

      int mid = len / 2;
      int [] left_arr = new int[mid];
      int [] right_arr = new int[len-mid];

    //Dividing array into two and copying into two separate arrays
      int k = 0;
      for(int i = 0;i<len;++i){
          if(i<mid){
              left_arr[i] = arr[i];
          }
          else{
              right_arr[k] = arr[i];
              k = k+1;
          }
      }
    // Recursively calling the function to divide the subarrays further
      mergeSort(left_arr,mid);
      mergeSort(right_arr,len-mid);
    // Calling the merge method on each subdivision
      merge(left_arr,right_arr,arr,mid,len-mid);
  }

  public static void main( String args[] ) {
        // int [] array = {12,1,10,50,5,15,45};
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int [] array = new int[n];
        int count=0;
          for(int i=0;i<n;i++)
        {
              array[i] = scan.nextInt();
        }
        // int [] array = {12,1,10,50,5,15,45};
        mergeSort(array,array.length);
        for(int v = 0; v<array.length;v++){
            if (k>array[v]){
                k=k-array[v];
                count++;
            }

        }
        System.out.print(count);
        // for(int i =0; i< array.length;++i){
        //     // System.out.print(array[i]+ " ");
        // }
    }
}

// our complexity is O(nlog n).
