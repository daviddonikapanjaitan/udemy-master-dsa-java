package C20AVLTree;

public class P1MainOperation {

    public static void main(String[] args) {
        AVL newAvl = new AVL();
        newAvl.insert(5);
        newAvl.insert(10);
        newAvl.insert(15);
        newAvl.insert(20);
        newAvl.levelOrder();
    }
}
