package C18TreeBinaryTree;

public class P17DeleteNode {

    public static void main(String[] args) {
        BinaryTree newBinaryTree = new BinaryTree(9);
        newBinaryTree.insert("N1");
        newBinaryTree.insert("N2");
        newBinaryTree.insert("N3");
        newBinaryTree.insert("N4");
        newBinaryTree.insert("N5");
        newBinaryTree.insert("N6");
        newBinaryTree.insert("N7");
        newBinaryTree.insert("N8");
        newBinaryTree.insert("N9");
        System.out.println();

        newBinaryTree.delete("N5");
        newBinaryTree.levelOrder();
    }
}
