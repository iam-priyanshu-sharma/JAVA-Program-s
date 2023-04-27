package sharma.priyanshu;

public class Main {

    public int size = 0;
    Node head, tail = null;

    public static void main (String[] args) {

        Main dList = new Main ();

        dList.addNode (1);
        dList.addNode (2);

        System.out.println ("Original list: ");
        dList.display ();

        dList.addInMid (3);
        System.out.println ("Updated List: ");
        dList.display ();

        dList.addInMid (4);
        System.out.println ("Updated List: ");
        dList.display ();

        dList.addInMid (5);
        System.out.println ("Updated List: ");
        dList.display ();
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

        size++;
    }

    public void addInMid (int data) {
        Node newNode = new Node (data);

        if ( head == null ) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        } else {
            Node current = head, temp;

            int mid = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);

            for (int i = 1; i < mid; i++) {
                current = current.next;
            }

            temp = current.next;
            temp.previous = current;

            current.next = newNode;
            newNode.previous = current;
            newNode.next = temp;
            temp.previous = newNode;
        }

        size++;
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
