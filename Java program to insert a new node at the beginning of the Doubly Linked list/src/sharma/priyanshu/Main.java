package sharma.priyanshu;

public class Main {
    public static void main (String[] args) {
        DoublyLinkedList list = new DoublyLinkedList ();
        list.insertAtBeginning (3);
        list.insertAtBeginning (2);
        list.insertAtBeginning (1);
        list.printList ();
    }
}

class Node {
    int data;
    Node prev;
    Node next;

    public Node (int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;

    public DoublyLinkedList () {
        this.head = null;
    }

    public void insertAtBeginning (int data) {
        Node newNode = new Node (data);

        if ( head == null ) {
            head = newNode;
            return;
        }

        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void printList () {
        Node current = head;

        while (current != null) {
            System.out.print (current.data + " ");
            current = current.next;
        }

        System.out.println ();
    }
}