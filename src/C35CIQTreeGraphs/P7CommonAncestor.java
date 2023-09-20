package C35CIQTreeGraphs;

public class P7CommonAncestor {

    public static P7TreeNode commonAncestor(P7TreeNode root,
                                            P7TreeNode p,
                                            P7TreeNode q){
        if((p == null) || (q == null)){
            return null;
        }

        P7TreeNode ap = p.parent;
        while(ap != null) {
            P7TreeNode aq = q.parent;
            while(aq != null) {
                if(aq == ap) {
                    return aq;
                }
                aq = aq.parent;
            }
            ap = ap.parent;
        }
        return null;
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 6, 1, 9, 11};
        P7TreeNode root = new P7TreeNode(20);
        for (int a : array) {
            root.insertInOrder(a);
        }
        P7TreeNode n1 = root.find(1);
        P7TreeNode n9 = root.find(9);
        P7TreeNode ancestor = P7CommonAncestor.commonAncestor(root, n1, n9);
        System.out.println(ancestor.data);
    }
}
