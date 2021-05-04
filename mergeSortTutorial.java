

class mergeSortTutorial{


  private static void printArray(int[] array){
    for(int i:array){
      System.out.print(i + " ");
    }
    System.out.println();
  }




  private static int[] mergeSort(int[] array){
    if(array.length <=1){
      return array;
    }
    int midpoint = array.length/2;
    int[] left = new int[midpoint];
    int[] right;
    if(array.length%2==0){
      right = new int[midpoint];
    }
    else {
      right = new int[midpoint + 1];
    }
    for(int i =0; i<midpoint;i++){
      left[i] = array[i];
    }
    for(int j=0;j<right.length;j++){
      right[j]= array[midpoint+j];
    }
    int[] result = new int[array.length];
    left = mergeSort(left);
    right = mergeSort(right);
    result = merge(left,right);
    return result;
  }





  private static int[] merge(int[]  left, int[] right){

    int[] result = new int[left.length + right.length];
    int leftpointer, rightpointer, resultpointer;
    leftpointer = rightpointer = resultpointer= 0;


    while(leftpointer <left.length || rightpointer<right.length){
      // count++;
          if(leftpointer <left.length && rightpointer < right.length){
                if(left[leftpointer]<right[rightpointer]){
                      result[resultpointer++]=left[leftpointer++];

                    }
                else{
                          result[resultpointer++] = right[rightpointer++];

                        }
          }

          else if(leftpointer<left.length){
                    result[resultpointer++] = left[leftpointer++];

                    }
        else if(rightpointer < right.length){
                result[resultpointer++]=right[rightpointer++];
              }

      }
  
      return result;
    }



    public static void main(String args[]){
      int[] array = {5,4,3,2,1};
      System.out.println("Initial array: ");
      printArray(array);
      array = mergeSort(array);
      System.out.println("Sorted Array: ");
      printArray(array);
    }



}
