class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinaryTree{
    Node root;
    BinaryTree() {
        root = null;
    }

    void printInOrder() {
        printInOrder(root);
        System.out.println();
    }

    void printInOrder(Node node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.key + " ");
        printInOrder(node.right);
    }

    void printPreOrder() {
        printPreOrder(root);
        System.out.println();
    }

    void printPreOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.key + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    void printPostOrder() {
        printPostOrder(root);
        System.out.println();
    }

    void printPostOrder(Node node) {
        if (node == null) {
            return;
        }
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.key + " ");
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        //       1 
        //    2     3
        // 4    5
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);

        System.out.println("in order traversal of binary tree");
        bt.printInOrder();

        System.out.println("pre order traversal of binary tree");
        bt.printPreOrder();

        System.out.println("post order traversal of binary tree");
        bt.printPostOrder();
    }
}
