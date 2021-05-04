import java.util.*;
class jv18_queue{
public static void main(String args[]){
  System.out.println("-----------------------------intialising the priority queue----------------------");
PriorityQueue<String> queue=new PriorityQueue<String>();
System.out.println("-----------------------------pupulating queue-----Amit,Vijay,Karan,Jai,Rahul-----------------");
queue.add("Amit");
queue.add("Vijay");
queue.add("Karan");
queue.add("Jai");
queue.add("Rahul");
System.out.println("-----------------------------ouputing queue head element----------------------");
System.out.println("head:"+queue.element());

System.out.println("-----------------------------outputhing peek element----------------------");
System.out.println("head:"+queue.peek());
System.out.println("-----------------------------looping prioity queue to iterator----------------------");
System.out.println("iterating the queue elements:");
Iterator itr=queue.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}

System.out.println("-----------------------------pulling element form queu using queue.remove()----------------------");
queue.remove();
System.out.println("-----------------------------pulling element form queu using queue.poll()----------------------");
queue.poll();
System.out.println("after removing two elements:");

System.out.println("-----------------------------looping true iterotor again----------------------");
Iterator<String> itr2=queue.iterator();
while(itr2.hasNext()){
System.out.println(itr2.next());
}
}
}
