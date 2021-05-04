public class jv15_binary_tree3{


  private class Node{
    Node left;
    Node right;
  }



  Node root;

  jv15_binary_tree3(){
    root = new Node();

    // Creating 2nd level (or generation):
    Node one = new Node();
    Node two = new Node();
    root.left = one;
    root.right = two;

    // Creating 3rd level:
    Node three = new Node();
    Node four = new Node();
    Node five = new Node();
    one.left = three;
    two.left = four;
    two.right = five;
  }

  int findMax(int a, int b){
    if(a >= b)
      return a;
    else
      return b;
  }

  int findHeight(Node root){
    // Base case:
    if(root == null)
      return 0;

    return findMax(findHeight(root.left), findHeight(root.right)) + 1;
  }

  public static void main(String[] args){
    jv15_binary_tree3 m = new jv15_binary_tree3();
    System.out.println("Height of tree: " + m.findHeight(m.root));
  }
}
