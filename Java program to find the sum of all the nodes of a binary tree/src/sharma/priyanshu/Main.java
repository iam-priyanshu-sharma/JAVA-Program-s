package sharma.priyanshu;

public class Main {

    public Node root;

    public static void main (String[] args) {

        Main bt = new Main ();

        bt.root = new Node (5);
        bt.root.left = new Node (2);
        bt.root.right = new Node (9);
        bt.root.left.left = new Node (1);
        bt.root.right.left = new Node (8);
        bt.root.right.right = new Node (6);

        System.out.println ("Sum of all nodes of binary tree: " + bt.calculateSum (bt.root));
    }

    public int calculateSum (Node temp) {
        int sum, sumLeft, sumRight;
        sum = sumRight = sumLeft = 0;

        if ( root == null ) {
            System.out.println ("Tree is empty");
            return 0;
        } else {
            if ( temp.left != null ) {
                sumLeft = calculateSum (temp.left);
            }

            if ( temp.right != null ) {
                sumRight = calculateSum (temp.right);
            }

            sum = temp.data + sumLeft + sumRight;
            return sum;
        }
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
