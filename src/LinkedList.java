
public class LinkedList {


    private String data;
    private Node next;
    private Node head;


    public LinkedList(Node next, Node head, String data) {
        this.data = data;
        this.next = next;
        this.head = head;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getHead() {
        return head;
    }

    public void setPrev(Node prev) {
        this.head = prev;
    }

    public boolean isEmpty() {
        return lenght() == 0;
    }


    public int lenght() {
        int lenght = 0;
        Node current = head;
        while (current != null) {
            lenght++;
            current = current.next;
        }
        return lenght;
    }

    private static class Node {
        private Node head;
        private Node next;
    }
}

