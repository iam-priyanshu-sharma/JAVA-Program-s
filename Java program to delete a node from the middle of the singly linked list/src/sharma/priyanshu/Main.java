package sharma.priyanshu;

public class Main {

    public static void main (String[] args) {

        DeleteMid sList = new DeleteMid ();

        sList.addNode (1);
        sList.addNode (2);
        sList.addNode (3);
        sList.addNode (4);

        System.out.println ("Original List: ");
        sList.display ();

        while (sList.head != null) {
            sList.deleteFromMid ();
            System.out.println ("Updated List: ");
            sList.display ();
        }
    }

    private static class Node {
        int data;
        Node next;

        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static class DeleteMid {
        private Node head = null;
        private Node tail = null;
        private int size = 0;

        public void addNode (int data) {
            Node newNode = new Node (data);

            if ( head == null ) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
            size++;
        }

        public void deleteFromMid () {
            if ( head == null || head.next == null ) {
                head = tail = null;
                size = 0;
                return;
            }

            int count = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
            Node temp = head, current = null;

            for (int i = 0; i < count - 1; i++) {
                current = temp;
                temp = temp.next;
            }

            if ( current != null ) {
                current.next = temp.next;
            } else {
                head = temp.next;
            }

            size--;
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
    }
}