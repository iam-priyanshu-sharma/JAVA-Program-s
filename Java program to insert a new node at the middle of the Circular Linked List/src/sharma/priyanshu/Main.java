package sharma.priyanshu;

public class Main {

    public int size;
    public Node head = null;
    public Node tail = null;

    public static void main (String[] args) {
        Main cl = new Main ();

        cl.add (1);
        cl.add (2);
        cl.add (3);
        cl.add (4);

        System.out.println ("Original list: ");
        cl.display ();

        cl.addInMid (5);
        System.out.println ("Updated List: ");
        cl.display ();

        cl.addInMid (6);
        System.out.println ("Updated List: ");
        cl.display ();
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

        size++;
    }

    public void addInMid (int data) {
        Node newNode = new Node (data);

        if ( head == null ) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            Node temp, current;
            int count = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
            temp = head;
            current = null;

            for (int i = 0; i < count; i++) {
                current = temp;
                temp = temp.next;
            }

            assert current != null;
            current.next = newNode;
            newNode.next = temp;
        }

        size++;
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

    public static class Node {
        int data;
        Node next;

        public Node (int data) {
            this.data = data;
        }
    }
}
