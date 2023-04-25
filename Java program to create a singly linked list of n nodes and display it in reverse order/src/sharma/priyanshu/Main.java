package sharma.priyanshu;

public class Main {

    private Node head = null;
    private Node tail = null;

    public static void main (String[] args) {
        Main sList = new Main ();

        sList.addNode (1);
        sList.addNode (2);
        sList.addNode (3);
        sList.addNode (4);

        System.out.println ("Original List: ");
        sList.printList ();

        sList.reverseList ();
        System.out.println ("Reversed List: ");
        sList.reversePrint (sList.head);
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

    public void printList () {
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

    public void reversePrint (Node current) {
        if ( current == null ) {
            return;
        }

        reversePrint (current.next);
        System.out.print (current.data + " ");
    }

    public void reverseList () {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    private static class Node {
        int data;
        Node next;

        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
}