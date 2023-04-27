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

        dList.display ();

        System.out.println ("\nCount of nodes present in the list: " + dList.countNodes ());
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

    public int countNodes () {
        int counter = 0;
        Node current = head;

        while (current != null) {
            counter++;
            current = current.next;
        }

        return counter;
    }

    public void display () {
        Node current = head;

        if ( head == null ) {
            System.out.println ("List is empty");
            return;
        }

        System.out.println ("Nodes of doubly linked list: ");

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
