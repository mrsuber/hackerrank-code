import java.util.*;

class jv17_stack {
  public static void main(String[] args){
    Stack<Integer> number = new Stack<>();

    //pushing into a Stack
    number.push(5);
    number.push(7);
    // int r = number.peek();
    System.out.println(number.search(5));
    System.out.println(number.peek());
    System.out.println("----------------------------------------------------");
    // System.out.println(r);

    //looping through a stack
    ListIterator<Integer> exampleIterator = number.listIterator(number.size());

    while (exampleIterator.hasPrevious()) {
      int iteration = exampleIterator.previous();
      System.out.println(iteration);
    }
    System.out.println("----------------------------------------------------");

    //popping for a Stack
    while(!number.isEmpty()){
      System.out.println(number.pop());
    }




  }
}
