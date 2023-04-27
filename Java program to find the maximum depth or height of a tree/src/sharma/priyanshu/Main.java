package sharma.priyanshu;

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
        bt.root.right.right.right = new Node (7);
        bt.root.right.right.right.right = new Node (8);

        System.out.println ("Maximum height of given binary tree: " + bt.findHeight (bt.root));
    }

    public int findHeight (Node temp) {
        if ( root == null ) {
            System.out.println ("Tree is empty");
            return 0;
        } else {
            int leftHeight = 0, rightHeight = 0;

            if ( temp.left != null ) {
                leftHeight = findHeight (temp.left);
            }

            if ( temp.right != null ) {
                rightHeight = findHeight (temp.right);
            }

            int max = Math.max (leftHeight, rightHeight);

            return (max + 1);
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
