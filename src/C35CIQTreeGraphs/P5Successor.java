package C35CIQTreeGraphs;

import C18TreeBinaryTree.TreeNode;

public class P5Successor {

    public static P5TreeNode inorderSucc(P5TreeNode n) {
        if(n == null) return null;

        if(n.parent == null || n.right != null) {
            return leftMostChild(n.right);
        } else {
            P5TreeNode q= n;
            P5TreeNode x = q.parent;
            while(x != null && x.left != q) {
                q = x;
                x = x.parent;
            }

            return x;
        }
    }

    public static P5TreeNode leftMostChild(P5TreeNode n) {
        if(n == null) {
            return null;
        }
        while (n.left != null) {
            n = n.left;
        }

        return n;
    }

    public static void main(String[] args) {
        int[] inputArray = {8,3,4,4};
        P5TreeNode tn = new P5TreeNode(inputArray.length);
        tn.createMinimalBST(inputArray);
        System.out.println(tn.isBST());
        inorderSucc(tn);
    }
}
