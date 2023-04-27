package sharma.priyanshu;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public Node root;

    public static void main (String[] args) {

        Main bt = new Main ();

        bt.root = new Node (1);
        bt.root.left = new Node (2);
        bt.root.right = new Node (3);
        bt.root.left.left = new Node (4);
        bt.root.right.left = new Node (5);
        bt.root.right.right = new Node (6);

        System.out.println ("Difference between sum of odd level and even level nodes: " + bt.difference ());
    }

    public int difference () {
        int oddLevel = 0, evenLevel = 0, diffOddEven;
        int nodesInLevel;
        int currentLevel = 0;

        Queue<Node> queue = new LinkedList<> ();

        if ( root == null ) {
            System.out.println ("Tree is empty");
            return 0;
        } else {
            queue.add (root);
            currentLevel++;

            while (queue.size () != 0) {
                nodesInLevel = queue.size ();

                while (nodesInLevel > 0) {
                    Node current = queue.remove ();

                    if ( currentLevel % 2 == 0 ) {
                        evenLevel += current.data;
                    } else {
                        oddLevel += current.data;
                    }

                    if ( current.left != null ) {
                        queue.add (current.left);
                    }

                    if ( current.right != null ) {
                        queue.add (current.right);
                    }

                    nodesInLevel--;
                }

                currentLevel++;
            }

            diffOddEven = Math.abs (oddLevel - evenLevel);
        }

        return diffOddEven;
    }

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node (int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
