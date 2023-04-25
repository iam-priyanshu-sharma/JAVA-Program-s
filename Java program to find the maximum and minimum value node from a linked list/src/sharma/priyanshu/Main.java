package sharma.priyanshu;

public class Main {

    public Node head = null;
    public Node tail = null;

    public static void main (String[] args) {

        Main sList = new Main ();

        sList.addNode (5);
        sList.addNode (8);
        sList.addNode (1);
        sList.addNode (6);

        sList.minNode ();
        sList.maxNode ();
    }

    public void addNode (int data) {
        Node newNode = new Node (data);

        if ( head == null ) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void minNode () {
        Node current = head;
        int min;

        if ( head == null ) {
            System.out.println ("List is empty");
        } else {
            min = head.data;

            while (current != null) {

                if ( min > current.data ) {
                    min = current.data;
                }
                current = current.next;
            }

            System.out.println ("Minimum value node in the list: " + min);
        }
    }

    public void maxNode () {
        Node current = head;
        int max;

        if ( head == null ) {
            System.out.println ("List is empty");
        } else {
            max = head.data;

            while (current != null) {

                if ( max < current.data ) {
                    max = current.data;
                }

                current = current.next;
            }

            System.out.println ("Maximum value node in the list: " + max);
        }
    }

    static class Node {
        int data;
        Node next;

        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
}
