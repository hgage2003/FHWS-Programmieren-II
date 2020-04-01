package wiederholung.BinaryTree;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);

        System.out.print("InOrder: ");
        tree.traverseInOrder();
        System.out.println();
        System.out.print("PreOrder: ");
        tree.traversePreOrder();
        System.out.println();
        System.out.print("PostOrder: ");
        tree.traversePostOrder();
        System.out.println();

        System.out.println();
        System.out.println("Min: " + tree.min());
        System.out.println("Max: " + tree.max());

        System.out.println();
        System.out.println("Delete:");
        tree.delete(27);
        tree.traverseInOrder();
        System.out.println();

    }
}
