package C18TreeBinaryTree;

import com.sun.source.tree.Tree;

public class P1CreateTree {

    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("hot");
        TreeNode cold = new TreeNode("cold");
        TreeNode tea = new TreeNode("Tea");
        TreeNode coffee = new TreeNode("Coffee");
        TreeNode wine = new TreeNode("Wine");
        TreeNode beer = new TreeNode("Beer");
        drinks.addChild(hot);
        drinks.addChild(cold);
        hot.addChild(tea);
        hot.addChild(coffee);
        cold.addChild(wine);
        cold.addChild(beer);
        System.out.println(drinks.print(0));
    }
}
