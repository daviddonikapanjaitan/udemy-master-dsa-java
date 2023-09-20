package C35CIQTreeGraphs;

public class P3CheckBalanced {
    public static int checkHeight(P3TreeNode root) {
        if(root == null) {
            return -1;
        }

        int leftHeight = checkHeight(root.left);
        if(leftHeight == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        int rightHeight = checkHeight(root.right);
        if(rightHeight == Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }

        int heightDiff =leftHeight - rightHeight;
        if(Math.abs(heightDiff) > 1) {
            return Integer.MIN_VALUE;
        }else{
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public static boolean isBalanced(P3TreeNode root) {
        return checkHeight(root) != Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        int[] inputArray = {8,3,4,4};
        P3TreeNode tn = new P3TreeNode(inputArray.length);
        tn.createMinimalBST(inputArray);
        System.out.println(tn.isBST());
        checkHeight(tn);
    }
}
