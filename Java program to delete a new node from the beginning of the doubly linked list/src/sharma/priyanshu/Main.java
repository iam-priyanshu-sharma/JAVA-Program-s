package sharma.priyanshu;

public class Main {

    Node head, tail = null;

    public static void main (String[] args) {

        Main dList = new Main ();

        dList.addNode (1);
        dList.addNode (2);
        dList.addNode (3);
        dList.addNode (4);
        dList.addNode (5);

        System.out.println ("Original List: ");
        dList.display ();

        while (dList.head != null) {
            dList.deleteFromStart ();
            System.out.println ("Updated List: ");
            dList.display ();
        }
    }

    public void addNode (int data) {
        Node newNode = new Node (data);

        if ( head == null ) {
            head = tail = newNode;
            head.previous = null;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        tail.next = null;
    }

    public void deleteFromStart () {
        if ( head == null ) {
        } else {
            if ( head != tail ) {
                head = head.next;
                head.previous = null;
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
        Node previous;
        Node next;

        public Node (int data) {
            this.data = data;
        }
    }
}
