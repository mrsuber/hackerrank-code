import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class jv9_sorting {

    public static void main(String[] args) {
//bubbleSort algorithm
// Bubble Sort
// Explanation
//
// Bubble sort works by swapping adjacent elements if they're not in the desired order. This process repeats from the beginning of the array until all elements are in order.
//
// We know that all elements are in order when we manage to do the whole iteration without swapping at all - then all elements we compared were in the desired order with their adjacent elements, and by extension, the whole array.
//
// Here are the steps for sorting an array of numbers from least to greatest:
//
//     4 2 1 5 3: The first two elements are in the wrong order, so we swap them.
//
//     2 4 1 5 3: The second two elements are in the wrong order too, so we swap.
//
//     2 1 4 5 3: These two are in the right order, 4 < 5, so we leave them alone.
//
//     2 1 4 5 3: Another swap.
//
//     2 1 4 3 5: Here's the resulting array after one iteration.
//
// Because at least one swap occurred during the first pass (there were actually three), we need to go through the whole array again and repeat the same process.
//
// By repeating this process, until no more swaps are made, we'll have a sorted array.
//
// The reason this algorithm is called Bubble Sort is because the numbers kind of "bubble up" to the "surface." If you go through our example again, following a particular number (4 is a great example), you'll see it slowly moving to the right during the process.
//
// All numbers move to their respective places bit by bit, left to right, like bubbles slowly rising from a body of water.
//
// If you'd like to read a detailed, dedicated article for Bubble Sort, we've got you covered!
// 1)time complexity of Bubble Sort is O(n^2)
// (n-1) + (n-2) + (n-3) + ..... + 3 + 2 + 1
// Sum = n(n-1)/2
// i.e O(n^2)
      int[] a = {5, 4, 3, 6, 8,7, 2, 1, 9};
      boolean sorted = false;
      int temp;
      while(!sorted) {
        sorted = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i+1]) {
                temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                sorted = false;
            }
        }
    }
    System.out.println("Bubble sort algorithm"+Arrays.toString(a));



//
// Insertion Sort
// Explanation
//
// The idea behind Insertion Sort is dividing the array into the sorted and unsorted subarrays.
//
// The sorted part is of length 1 at the beginning and is corresponding to the first (left-most) element in the array. We iterate through the array and during each iteration, we expand the sorted portion of the array by one element.
//
// Upon expanding, we place the new element into its proper place within the sorted subarray. We do this by shifting all of the elements to the right until we encounter the first element we don't have to shift.
//
// For example, if in the following array the bolded part is sorted in an ascending order, the following happens:
//
//     3 5 7 8 4 2 1 9 6: We take 4 and remember that that's what we need to insert. Since 8 > 4, we shift.
//
//     3 5 7 x 8 2 1 9 6: Where the value of x is not of crucial importance, since it will be overwritten immediately (either by 4 if it's its appropriate place or by 7 if we shift). Since 7 > 4, we shift.
//
//     3 5 x 7 8 2 1 9 6
//
//     3 x 5 7 8 2 1 9 6
//
//     3 4 5 7 8 2 1 9 6
//
// After this process, the sorted portion was expanded by one element, we now have five rather than four elements. Each iteration does this and by the end we'll have the whole array sorted.
//
// If you'd like to read a detailed, dedicated article for Insertion Sort, we've got you covered!

//time complexity n^2
int[] array1 = {5, 4, 3, 6, 8,7, 2, 1, 9};
for (int i = 1; i < array1.length; i++) {
  int current = array1[i];
  int j = i - 1;
  while(j >= 0 && current < array1[j]) {
      array1[j+1] = array1[j];
      j--;
  }
  // at this point we've exited, so j is either -1
  // or it's at the first element where current >= a[j]
  array1[j+1] = current;
}
  System.out.println("Insertion sort algorithm"+Arrays.toString(array1));



//   Selection Sort
// Explanation
//
// Selection Sort also divides the array into a sorted and unsorted subarray. Though, this time, the sorted subarray is formed by inserting the minimum element of the unsorted subarray at the end of the sorted array, by swapping:
//
//     3 5 1 2 4
//
//     1 5 3 2 4
//
//     1 2 3 5 4
//
//     1 2 3 5 4
//
//     1 2 3 4 5
//
//     1 2 3 4 5
//time complexity n^2
int[] array2 = {5, 4, 3, 6, 8,7, 2, 1, 9};
for (int i = 0; i < array2.length; i++) {
      int min = array2[i];
      int minId = i;
      for (int j = i+1; j < array2.length; j++) {
          if (array2[j] < min) {
              min = array2[j];
              minId = j;
          }
      }
      // swapping
      int temp2 = array2[i];
      array2[i] = min;
      array2[minId] = temp2;
  }

    System.out.println("Selection sort algorithm"+Arrays.toString(array2));



//     Merge Sort
// Explanation
//
// Merge Sort uses recursion to solve the problem of sorting more efficiently than algorithms previously presented, and in particular it uses a divide and conquer approach.
//
// Using both of these concepts, we'll break the whole array down into two subarrays and then:
//
//     Sort the left half of the array (recursively)
//     Sort the right half of the array (recursively)
//     Merge the solutions
//     This tree is meant to represent how the recursive calls work. The arrays marked with the down arrow are the ones we call the function for, while we're merging the up arrow ones going back up. So you follow the down arrow to the bottom of the tree, and then go back up and merge.
//
// In our example, we have the array 3 5 3 2 1, so we divide it into 3 5 4 and 2 1. To sort them, we further divide them into their components. Once we've reached the bottom, we start merging up and sorting them as we go.
//
// If you'd like to read a detailed, dedicated article for Merge Sort, we've got you covered!
    int[] array3= {5, 4, 3, 6, 8,7, 2, 1, 9};
    int left=0;
    int right=array3.length-1;
    int mid=(right+left)/2;

    int lengthLeft = mid - left + 1;
    int lengthRight = right - mid;

    // creating temporary subarrays
    int leftArray[] = new int [lengthLeft];
    int rightArray[] = new int [lengthRight];

    // copying our sorted subarrays into temporaries
    for (int i = 0; i < lengthLeft; i++)
        leftArray[i] = array3[left+i];
    for (int i = 0; i < lengthRight; i++)
        rightArray[i] = array3[mid+i+1];

    // iterators containing current index of temp subarrays
    int leftIndex = 0;
    int rightIndex = 0;

    // copying from leftArray and rightArray back into array
    for (int i = left; i < right + 1; i++) {
        // if there are still uncopied elements in R and L, copy minimum of the two
        if (leftIndex < lengthLeft && rightIndex < lengthRight) {
            if (leftArray[leftIndex] < rightArray[rightIndex]) {
                array3[i] = leftArray[leftIndex];
                leftIndex++;
            }
            else {
                array3[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
        // if all the elements have been copied from rightArray, copy the rest of leftArray
        else if (leftIndex < lengthLeft) {
            array3[i] = leftArray[leftIndex];
            leftIndex++;
        }
        // if all the elements have been copied from leftArray, copy the rest of rightArray
        else if (rightIndex < lengthRight) {
            array3[i] = rightArray[rightIndex];
            rightIndex++;
        }
    }
        System.out.println("Mergesort sort algorithm does not work."+Arrays.toString(array3));


    }
}
