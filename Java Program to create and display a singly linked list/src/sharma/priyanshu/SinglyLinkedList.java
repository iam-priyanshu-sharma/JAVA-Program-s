package sharma.priyanshu;

public class SinglyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;

    public void addNode(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void display() {
        Node<T> current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.println("Nodes of singly linked list: ");

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    private static class Node<T> {
        private final T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}