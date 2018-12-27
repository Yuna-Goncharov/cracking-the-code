public class NodeForLinkedList {

    private  String data;
    private Node next;

    public NodeForLinkedList(Node next, String data) {
        this.data = data;
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
