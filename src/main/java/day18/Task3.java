package day18;


public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);

        root.add(5);
        root.add(8);
        root.add(11);
        root.add(14);
        root.add(15);
        root.add(16);
        root.add(18);
        root.add(22);
        root.add(23);
        root.add(24);
        root.add(27);
        root.add(150);

        root.dfs(root);

    }
}