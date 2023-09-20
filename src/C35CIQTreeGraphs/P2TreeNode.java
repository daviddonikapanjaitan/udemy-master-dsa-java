package C35CIQTreeGraphs;

public class P2TreeNode {
    public int data;
    public P2TreeNode left;
    public P2TreeNode right;
    public P2TreeNode parent;
    public int size = 0;

    public P2TreeNode(int d){
        data = d;
        size = 1;
    }

    public boolean isBST(){
        if(left != null) {
            if(data < left.data || !left.isBST()){
                return false;
            }
        }

        if(right != null) {
            if(data >= right.data || !right.isBST()) {
                return false;
            }
        }

        return true;
    }

    public int height () {
        int leftHeight = left != null ? left.height() : 0;
        int rightHeight = right != null ? right.height() : 0;
        return  1 + Math.max(leftHeight, rightHeight);
    }

    private void setLeftChild(P2TreeNode left) {
        this.left = left;
        if(left != null) {
            left.parent = this;
        }
    }

    private void setRightChild(P2TreeNode right) {
        this.right = right;
        if(right != null) {
            right.parent = this;
        }
    }

    private static P2TreeNode createMinimalBST(int arr[], int start, int end) {
        if(end < start) {
            return null;
        }

        int mid = (start + end) / 2;
        P2TreeNode n = new P2TreeNode(arr[mid]);
        n.setLeftChild(createMinimalBST(arr, start, mid - 1));
        n.setRightChild(createMinimalBST(arr, mid + 1, end));

        return n;
    }

    public static P2TreeNode createMinimalBST(int[] array) {
        return createMinimalBST(array, 0, array.length - 1);
    }

    public static void main(String[] args) {
        int[] inputArray = {8,3};
        P2TreeNode tn = new P2TreeNode(inputArray.length);
        tn.createMinimalBST(inputArray);
        System.out.println(tn.isBST());
    }
}
