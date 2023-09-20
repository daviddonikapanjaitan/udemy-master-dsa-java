package C35CIQTreeGraphs;

public class P4ValidateBST {

    public static Integer lastPrinted = null;

    public static boolean checkBST(P4TreeNode node) {
        return checkBST(node, true);
    }

    public static boolean checkBST(P4TreeNode n, boolean isLeft) {
        if (n == null) {
            return true;
        }

        // Check / recurse left
        if (!checkBST(n.left, true)) {
            return false;
        }

        // Check current
        if (lastPrinted != null) {
            if (isLeft) {
                // left child "is allowed" be equal to parent.
                if (n.data < lastPrinted) {
                    return false;
                }
            } else {
                // Right child "is not allowed" be equal to parent.
                if (n.data <= lastPrinted) {
                    return false;
                }
            }
        }
        lastPrinted = n.data;

        // Check / recurse right
        if (!checkBST(n.right, false)) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] inputArray = {8,3,4,4};
        P4TreeNode tn = new P4TreeNode(inputArray.length);
        tn.createMinimalBST(inputArray);
        System.out.println(tn.isBST());
        checkBST(tn);
    }
}
