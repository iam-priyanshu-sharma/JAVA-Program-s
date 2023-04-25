package sharma.priyanshu;

public class Main {

    public Node head = null;
    public Node tail = null;

    public static void main (String[] args) {

        Main sList = new Main ();

        sList.addAtStart (1);
        sList.display ();

        sList.addAtStart (2);
        sList.display ();

        sList.addAtStart (3);
        sList.display ();

        sList.addAtStart (4);
        sList.display ();
    }

    public void addAtStart (int data) {
        Node newNode = new Node (data);

        if ( head == null ) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
    }

    public void display () {
        Node current = head;

        if ( head == null ) {
            System.out.println ("List is empty");
            return;
        }

        System.out.println ("Adding nodes to the start of the list: ");

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
