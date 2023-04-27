package sharma.priyanshu;

public class Main {

    int size = 0;
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

        dList.rotateList (3);

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

    public void rotateList (int n) {
        Node current = head;

        if ( n == 0 || n >= size ) {
            return;
        }
        else {
            for (int i = 1; i < n; i++) {
                current = current.next;
            }

            tail.next = head;
            head = current.next;
            head.previous = null;
            tail = current;
            tail.next = null;
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
