package wiederholung.BinaryTree;

public class Tree {
    TreeNode root;

    public void traverseInOrder() {
        if (root != null) root.traverseInOrder();
    }

    public void traversePreOrder() {
        if (root != null) root.traversePreOrder();
    }

    public void traversePostOrder() {
        if (root != null) root.traversePostOrder();
    }

    public void insert(int value) {
        if (root == null) { //empty tree
            root = new TreeNode(value);
        } else { //else traverse
            root.insert(value);
        }
    }

    public TreeNode get(int value) {
        if (root != null) return root.get(value);
        return null;
    }

    public int min() {
        if(root == null) {
            return Integer.MIN_VALUE;
        } else {
            return root.min();
        }
    }

    public int max() {
        if(root == null) {
            return Integer.MAX_VALUE;
        } else {
            return root.max();
        }
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    public TreeNode delete(TreeNode subtreeRoot, int value) {
        if (subtreeRoot == null) {
            return null;
        }

        //recursion here, replacement (setter) will be executed at the end of the recursion call
        //if it wont change, it will just get the same node back, which is already the left child
        if (subtreeRoot.getData() > value) {
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        } else if (subtreeRoot.getData() < value) {
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
        } else {
            //value == subtreeRoot.data (Node found)
            //case 1: if subtreeRoot has a right child, return it, so node can be replaced with it
            //case 2: if it doesn't have a right child (which means subtreeRoot is a leaf), it will return null
            if (subtreeRoot.getLeftChild() == null) {
                return subtreeRoot.getRightChild();
            } else if (subtreeRoot.getRightChild() == null) {
                return subtreeRoot.getLeftChild();
            }

            //case 3: node to delete has 2 children
            //replace the value in the subtree node with the smallest value
            //from the right subtree
            subtreeRoot.setData(subtreeRoot.getRightChild().min());

            //delete the node that has the smallest value in the right subtree
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getData()));
        }
        //its not the node that we want to delete, so simply return
        return subtreeRoot;
    }
}
