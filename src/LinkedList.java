
public class LinkedList {


    private Integer data;
    private Node next;
    private Node head;
    private Node tail;
    private Node prev;


    public LinkedList(Node next, Node head,Node tail,Node prev, Integer data) {
        this.data = data;
        this.next = next;
        this.head = head;
        this.tail = tail;
        this.prev = prev;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }


    public Node getTail() {return  tail;}

    public void setTail(Node tail) {
        this.tail = tail;
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

    public void createNode(Integer data){
        if(head == null){
            head = new Node();
        }
        tail().next = new Node();


    }

    public Node remove( Node head, Integer data){
        if(head == null){
            head = new Node();
            tail = head;
            return head.next;
        }
        if(head.data == data  ) {
            tail.next = tail.next.next;
        }
            return head;

        //head = head.next;
    }

    public Node tail() {
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        return tail;

    }
    private  class Node {
        private Node head;
        private Node next;
        private Node tail;
        private Node prev;
        private Integer data;


        public Integer getData() {
            return data;
        }

        public void setData(Integer data) {
            this.data = data;
        }
    }

    }

