package sharma.priyanshu;

public class Main {

    public Node head = null;
    public Node tail = null;

    public static void main (String[] args) {
        Main cl = new Main ();
        cl.add (1);
        cl.add (2);
        cl.add (3);
        cl.add (4);
        cl.add (5);
        cl.add (6);

        System.out.println ("Original List: ");
        cl.display ();

        System.out.println ("Reversed List: ");
        cl.reverse (cl.head);
    }

    public void add (int data) {
        Node newNode = new Node (data);

        if ( head == null ) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void display () {
        Node current = head;

        if ( head == null ) {
            System.out.println ("List is empty");
        } else {
            do {
                System.out.print (" " + current.data);
                current = current.next;
            } while (current != head);

            System.out.println ();
        }
    }

    public void reverse (Node current) {
        if ( current.next == head ) {
            System.out.print (" " + current.data);
            return;
        }

        reverse (current.next);
        System.out.print (" " + current.data);
    }

    public static class Node {
        int data;
        Node next;

        public Node (int data) {
            this.data = data;
        }
    }
}
