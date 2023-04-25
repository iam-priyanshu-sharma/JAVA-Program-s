package sharma.priyanshu;

public class Main {

    public Node head = null;
    public Node tail = null;

    public static void main (String[] args) {

        Main sList = new Main ();
        sList.addNode (1);
        sList.addNode (2);
        sList.addNode (3);
        sList.addNode (4);

        System.out.println ("Original List: ");
        sList.display ();

        while (sList.head != null) {
            sList.deleteFromStart ();
            System.out.println ("Updated List: ");
            sList.display ();
        }
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

    public void deleteFromStart () {

        if ( head == null ) {
            System.out.println ("List is empty");
        } else {
            if ( head != tail ) {
                head = head.next;
            } else {
                head = tail = null;
            }
        }
    }

    public void display () {
        Node current = head;

        if ( head == null ) {
            System.out.println ("List is empty");
            return;
        }

        while (current != null) {
            System.out.print (current.data + " ");
            current = current.next;
        }

        System.out.println ();
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