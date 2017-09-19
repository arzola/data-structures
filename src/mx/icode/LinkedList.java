package mx.icode;

public class LinkedList {

    private Node Head;

    class Node {

        private int value;

        public Node next;

        public Node(int value) {

            this.value = value;
        }

    }

    public LinkedList(int value) {
        super();
        this.Head = new Node(value);
    }

    public LinkedList append(int val) {

        Node current = this.Head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(val);
        return this;

    }

    public LinkedList appendFirst(int val) {
        Node temp = this.Head;
        this.Head = new Node(val);
        this.Head.next = temp;
        return this;
    }

    public LinkedList replaceHead(int val) {
        Node temp = this.Head;
        this.Head = new Node(val);
        this.Head.next = temp.next;
        return this;
    }

    public LinkedList insertAtIndex(int index, int val) {
        Node current = this.Head;
        int currentIndex = 0;
        if (index == 0) {
            return this.appendFirst(val);
        }
        while (current.next != null) {
            currentIndex++;
            if (currentIndex == index) {
                Node after = current.next;
                Node prev = current;
                prev.next = new Node(val);
                prev.next.next = after;
            }
            current = current.next;
        }
        if (currentIndex < index) {
            throw new NullPointerException();
        }
        return this;
    }


    public String printList() {
        Node current = this.Head;
        StringBuilder listRepresentation = new StringBuilder("[HEAD {");
        listRepresentation.append(current.value);
        listRepresentation.append("}]");
        while (current.next != null) {
            current = current.next;
            listRepresentation.append("->{").append(current.value).append("}");
        }
        return listRepresentation.toString();
    }

}