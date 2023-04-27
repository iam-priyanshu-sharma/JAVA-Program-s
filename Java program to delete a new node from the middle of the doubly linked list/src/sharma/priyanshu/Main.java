package sharma.priyanshu;

public class Main {

    static class Node{
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public int size = 0;
    Node head, tail = null;

    public void addNode(int data) {
        Node newNode = new Node (data);

        if(head == null) {
            head = tail = newNode;
            head.previous = null;
        }
        else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        tail.next = null;

        size++;
    }

    public void deleteFromMid() {
        if(head == null) {
            return;
        }
        else {
            Node current = head;

            int mid = (size % 2 == 0) ? (size/2) : ((size+1)/2);

            for(int i = 1; i < mid; i++){
                current = current.next;
            }

            if(current == head) {
                head = current.next;
            }
            else if(current == tail) {
                tail = tail.previous;
            }
            else {
                current.previous.next = current.next;
                current.next.previous = current.previous;
            }
        }

        size--;
    }

    public void display() {
        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Main dList = new Main();
  
        dList.addNode(1);
        dList.addNode(2);
        dList.addNode(3);
        dList.addNode(4);
        dList.addNode(5);
  
        System.out.println("Original List: ");
        dList.display();
        
        while(dList.head != null) {
            dList.deleteFromMid();  
            System.out.println("Updated List: ");
            dList.display();
        }
    }
}
