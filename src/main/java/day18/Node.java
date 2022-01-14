package day18;

public class Node {
    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    private Node addNewValue(Node node, int value) {
        if (node == null)
            return new Node(value);
        if (value < node.getValue()) {
            node.setLeft(addNewValue(node.getLeft(), value));
        } else if (value >= node.getValue()) {
            node.setRight(addNewValue(node.getRight(), value));
        }
        return node;
    }

    public void add(int value) {
        this.addNewValue(this, value);
    }

    public void dfs(Node node) {
        if (node != null) {
            node.dfs(node.getLeft());
            System.out.print(" " + node.getValue());
            node.dfs(node.getRight());
        }


    }
}
