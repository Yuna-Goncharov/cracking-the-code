public class BinaryTree {

  private  Node root;

    public BinaryTree(int key){
        root = new Node(key);
    }

    public BinaryTree(){
        root = null;
    }

}



class Node{
    private Node left;
    private Node right;
    private int key;

    public Node(int key){
        this.key=key;
        left = right = null;
    }

    private Node addRecursive(Node current, int key) {
        if (current == null) {
            return new Node(key);
        }

        if (key < current.key) {
            current.left = addRecursive(current.left, key);
        } else if (key > current.key) {
            current.right = addRecursive(current.right, key);
        } else {
            // value already exists
            return current;
        }

        return current;
    }


}
