package sharma.priyanshu;

public class Main {

    public Node root;

    public static void main (String[] args) {

        Main bt1 = new Main ();
        bt1.root = new Node (1);
        bt1.root.left = new Node (2);
        bt1.root.right = new Node (3);
        bt1.root.left.left = new Node (4);
        bt1.root.right.left = new Node (5);
        bt1.root.right.right = new Node (6);

        Main bt2 = new Main ();
        bt2.root = new Node (1);
        bt2.root.left = new Node (2);
        bt2.root.right = new Node (3);
        bt2.root.left.left = new Node (4);
        bt2.root.right.left = new Node (5);
        bt2.root.right.right = new Node (6);

        if ( areIdenticalTrees (bt1.root, bt2.root) ) {
            System.out.println ("Both the binary trees are identical");
        } else {
            System.out.println ("Both the binary trees are not identical");
        }
    }

    public static boolean areIdenticalTrees (Node root1, Node root2) {
        if ( root1 == null && root2 == null ) {
            return true;
        }

        if ( root1 == null && root2 == null ) {
            return true;
        }

        if ( root1 != null && root2 != null ) {
            return ((root1.data == root2.data) &&
                    (areIdenticalTrees (root1.left, root2.left)) &&
                    (areIdenticalTrees (root1.right, root2.right)));
        }

        return false;
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
