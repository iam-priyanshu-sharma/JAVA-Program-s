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

        dList.reverse ();

        System.out.println ("Reversed List: ");
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

    public void reverse () {
        Node current = head, temp;

        while (current != null) {
            temp = current.next;
            current.next = current.previous;
            current.previous = temp;
            current = current.previous;
        }

        temp = head;
        head = tail;
        tail = temp;
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
