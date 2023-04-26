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

        System.out.println ("Original List: ");
        cl.display ();

        while (cl.head != null) {
            cl.deleteMid ();
            System.out.println ("Updated List: ");
            cl.display ();
        }
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

    public void deleteMid () {
        Node current, temp;

        if ( head == null ) {
            return;
        } else {
            int count = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);

            if ( head != tail ) {
                temp = head;
                current = null;

                for (int i = 0; i < count - 1; i++) {
                    current = temp;
                    temp = temp.next;
                }

                if ( current != null ) {
                    current.next = temp.next;
                } else {
                    head = tail = temp.next;
                    tail.next = head;
                }
            } else {
                head = tail = null;
            }
        }

        size--;
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
