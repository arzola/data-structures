package mx.icode;

public class LinkedList {

    private Node Head;

    public String printList() {
        return "[HEAD {0}]";
    }

    class Node {

        private int value;
        public Node next = null;

        public Node(int value) {
            this.value = value;
        }
    }

    public void LinkedList(Node head) {
        this.Head = head;
    }

    public boolean append(int val) {

        if (this.Head.next == null) {
            Node next = new Node(val);
            this.Head.next = next;
            return true;
        }

        Node current = this.Head;

        while (current.next != null) {
            current = current.next.next;
        }

        current.next = new Node(val);
        return true;

    }

}