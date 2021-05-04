import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

   private static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }

        void swapNodes(){
            Node temp = left;
            left = right;
            right = temp;
        }
    }

    static Node buildTree(int data, int[][] indexes, List<Node> tree){
        if(data == -1){
            return null;
        }
        Node node = new Node(data);
        int[] nodePair = indexes[data-1];
        node.left = buildTree(nodePair[0], indexes, tree);
        node.right = buildTree(nodePair[1], indexes, tree);
        tree.add(node);
        return node;
    }

    /*
     * Complete the swapNodes function below.
     */
    static int[][] swapNodes(int[][] indexes, int[] queries) {
        /*
         * Write your code here.
         */
         List<Node> tree = new ArrayList();
        Node root = buildTree(1, indexes, tree);
        int[][] traverses = new int[queries.length][tree.size()];
        for(int i = 0; i < queries.length; i++){
            int q = queries[i];
            swapper(root, 1, q);
            int[] path = traverse(root);
            traverses[i] = path;
        }
        // final output
        return traverses;
    }


    static void swapper(Node node, int depth, int target){
        if(node == null) return;
        if(depth % target == 0){
            node.swapNodes();
        }
        swapper(node.left, depth+1, target);
        swapper(node.right, depth+1, target);
    }

    static int[] traverse(Node node){
        List<Integer> order = new ArrayList();
        innerTravers(node, order);
        int[] path = new int[order.size()];
        for(int i = 0; i < order.size(); i++){
            path[i] = order.get(i);
        }
        return path;
    }

    static void innerTravers(Node node, List<Integer> nodeOrder){
        if(node == null) return;
        innerTravers(node.left, nodeOrder);
        nodeOrder.add(node.data);
        innerTravers(node.right, nodeOrder);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scanner.nextLine().trim());

        int[][] indexes = new int[n][2];

        for (int indexesRowItr = 0; indexesRowItr < n; indexesRowItr++) {
            String[] indexesRowItems = scanner.nextLine().split(" ");

            for (int indexesColumnItr = 0; indexesColumnItr < 2; indexesColumnItr++) {
                int indexesItem = Integer.parseInt(indexesRowItems[indexesColumnItr].trim());
                indexes[indexesRowItr][indexesColumnItr] = indexesItem;
            }
        }

        int queriesCount = Integer.parseInt(scanner.nextLine().trim());

        int[] queries = new int[queriesCount];

        for (int queriesItr = 0; queriesItr < queriesCount; queriesItr++) {
            int queriesItem = Integer.parseInt(scanner.nextLine().trim());
            queries[queriesItr] = queriesItem;
        }

        int[][] result = swapNodes(indexes, queries);

        for (int resultRowItr = 0; resultRowItr < result.length; resultRowItr++) {
            for (int resultColumnItr = 0; resultColumnItr < result[resultRowItr].length; resultColumnItr++) {
                bufferedWriter.write(String.valueOf(result[resultRowItr][resultColumnItr]));

                if (resultColumnItr != result[resultRowItr].length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            if (resultRowItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
