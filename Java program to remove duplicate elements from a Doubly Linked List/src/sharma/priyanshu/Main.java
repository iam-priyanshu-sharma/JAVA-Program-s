package sharma.priyanshu;

public class Main {

    Node head, tail = null;

    public static void main (String[] args) {

        Main dList = new Main ();

        dList.addNode (1);
        dList.addNode (2);
        dList.addNode (3);
        dList.addNode (2);
        dList.addNode (2);
        dList.addNode (4);
        dList.addNode (5);
        dList.addNode (3);

        System.out.println ("Originals list: ");
        dList.display ();

        dList.removeDuplicateNode ();

        System.out.println ("List after removing duplicates: ");
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
    }

    public void removeDuplicateNode () {
        Node current, index;

        if ( head == null ) {
            return;
        } else {
            for (current = head; current != null; current = current.next) {
                for (index = current.next; index != null; index = index.next) {
                    if ( current.data == index.data ) {
                        index.previous.next = index.next;

                        if ( index.next != null ) {
                            index.next.previous = index.previous;
                        }

                    }
                }
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
