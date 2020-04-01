package ueb19.aufgabe2;

class GenericTree<T extends Comparable<T>> {
	GenericNode root;

	public void insert(T value) {
		if (root == null) {
			root = new GenericNode(value);
		} else {
			root.insert(value);
		}
	}

	public void traverseInOrder() {
		if (root != null) {
			root.traverseInOrder();
		}
	}

	private static class GenericNode<T extends Comparable<T>> {
		GenericNode left;
		GenericNode right;
		T data;

		public GenericNode(T data) {
			this.data = data;
		}

		public void insert(T value) {
			if (data.equals(value)) return;

			if (data.compareTo(value) > 0) {
				if (left == null) {
					left = new GenericNode(value);
				} else {
					left.insert(value);
				}
			} else {
				if (right == null) {
					right = new GenericNode(value);
				} else {
					right.insert(value);
				}
			}
		}

		public void traverseInOrder() {
			if (left != null) {
				left.traverseInOrder();
			}
			System.out.println(data + " ");
			if (right != null) {
				right.traverseInOrder();
			}
		}
	}

	public static void main(String[] args) {

		GenericTree tree = new GenericTree();
		tree.insert(2);
		tree.insert(5);
		tree.insert(20);
		tree.insert(51);
		tree.insert(98);
		tree.insert(7);

		tree.traverseInOrder();
	}
}
