package sharma.priyanshu;

public class Main {

    Node head;

    public static void main (String[] args) {
        Main list = new Main ();

        list.head = new Node (100);
        Node second = new Node (200);
        Node third = new Node (300);

        list.head.next = second;
        second.next = third;
        list.display ();
    }

    public void display () {
        Node n = head;
        while (n != null) {
            System.out.print (n.data + " \n");
            n = n.next;
        }
    }

    static class Node {
        int data;
        Node next;

        Node (int d) {
            data = d;
            next = null;
        }
    }
}