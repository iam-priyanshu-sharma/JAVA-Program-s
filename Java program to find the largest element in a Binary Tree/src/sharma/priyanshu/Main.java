package sharma.priyanshu;

public class Main {

    public Node root;

    public static void main (String[] args) {

        Main bt = new Main ();

        bt.root = new Node (15);
        bt.root.left = new Node (20);
        bt.root.right = new Node (35);
        bt.root.left.left = new Node (74);
        bt.root.right.left = new Node (55);
        bt.root.right.right = new Node (6);

        System.out.println ("Largest element in the binary tree: " + bt.largestElement (bt.root));
    }

    public int largestElement (Node temp) {
        if ( root == null ) {
            System.out.println ("Tree is empty");
            return 0;
        } else {
            int leftMax, rightMax;
            int max = temp.data;

            if ( temp.left != null ) {
                leftMax = largestElement (temp.left);
                max = Math.max (max, leftMax);
            }

            if ( temp.right != null ) {
                rightMax = largestElement (temp.right);
                max = Math.max (max, rightMax);
            }

            return max;
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
