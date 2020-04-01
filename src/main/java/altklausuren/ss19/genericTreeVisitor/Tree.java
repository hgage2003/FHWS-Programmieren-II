package altklausuren.ss19.genericTreeVisitor;

public class Tree<E extends Comparable<E>> {
    Node<E> root;

    public interface Visitor<T> {
        void visit(Node<T> current);
    }

    public static class Node<E> {
        Node<E> left;
        Node<E> right;
        E content;

        public Node(E content) {
            this.content = content;
        }
    }

    public class MyVisitor<T> implements Visitor<T> {
        private int count = 0;

        @Override
        public void visit(Node<T> current) {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    public void insert(E content) {
        if (root == null) root = new Node<E>(content);
        else insert(root, content);
    }

    public void insert(Node<E> node, E content) {
        if (node.content.compareTo(content) > 0) {
            if (node.left == null) node.left = new Node<E>(content);
            else insert(node.left, content);
        } else {
            if (node.right == null) node.right = new Node<E>(content);
            else insert(node.right, content);
        }
    }

    public int size() {
        MyVisitor<E> mv = new MyVisitor<>();
        traverse(mv);
        return mv.getCount();
    }

    protected void traverse(Visitor<E> visitor) {
        if (root == null) return;
        else traverse(root, visitor);
    }

    protected void traverse(Node<E> current, Visitor<E> visitor) {
        if (current.left != null) traverse(current.left, visitor);
        System.out.println(current.content);
        visitor.visit(current);
        if (current.right != null) traverse(current.right, visitor);
    }

    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();
        tree.insert(5);
        tree.insert(10);
        tree.insert(2);
        tree.insert(4);

        System.out.println("size: " + tree.size());
    }

}
