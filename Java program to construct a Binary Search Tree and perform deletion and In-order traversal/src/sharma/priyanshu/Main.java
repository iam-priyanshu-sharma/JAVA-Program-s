package sharma.priyanshu;

public class Main {

    public Node root;

    public static void main (String[] args) {

        Main bt = new Main ();

        bt.insert (50);
        bt.insert (30);
        bt.insert (70);
        bt.insert (60);
        bt.insert (10);
        bt.insert (90);

        System.out.println ("Binary search tree after insertion:");

        bt.inorderTraversal (bt.root);

        Node deletedNode = null;

        deletedNode = bt.deleteNode (bt.root, 90);
        System.out.println ("\nBinary search tree after deleting node 90:");
        bt.inorderTraversal (bt.root);

        deletedNode = bt.deleteNode (bt.root, 30);
        System.out.println ("\nBinary search tree after deleting node 30:");
        bt.inorderTraversal (bt.root);

        deletedNode = bt.deleteNode (bt.root, 50);
        System.out.println ("\nBinary search tree after deleting node 50:");
        bt.inorderTraversal (bt.root);
    }

    public void insert (int data) {
        Node newNode = new Node (data);

        if ( root == null ) {
            root = newNode;
        } else {
            Node current = root, parent;

            while (true) {
                parent = current;

                if ( data < current.data ) {
                    current = current.left;

                    if ( current == null ) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;

                    if ( current == null ) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public Node minNode (Node root) {
        if ( root.left != null ) {
            return minNode (root.left);
        } else {
            return root;
        }
    }

    public Node deleteNode (Node node, int value) {
        if ( node == null ) {
            return null;
        } else {
            if ( value < node.data ) {
                node.left = deleteNode (node.left, value);
            } else if ( value > node.data ) {
                node.right = deleteNode (node.right, value);
            } else {
                if ( node.left == null && node.right == null ) {
                    node = null;
                } else if ( node.left == null ) {
                    node = node.right;
                } else if ( node.right == null ) {
                    node = node.left;
                } else {
                    Node temp = minNode (node.right);
                    node.data = temp.data;
                    node.right = deleteNode (node.right, temp.data);
                }
            }

            return node;
        }
    }

    public void inorderTraversal (Node node) {

        if ( root == null ) {
            System.out.println ("Tree is empty");
        } else {

            if ( node.left != null ) {
                inorderTraversal (node.left);
            }

            System.out.print (node.data + " ");

            if ( node.right != null ) {
                inorderTraversal (node.right);
            }
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
