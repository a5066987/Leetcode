/**
 * Created by cuibowu on 2017/8/30.
 */
public class Solution230 {
    public int kthSmallest(TreeNode root, int k) {
        int count = count(root.left);
        if(k<=count)
            return kthSmallest(root.left,k);
        else if(k>count+1)
            return kthSmallest(root.right,k-1-count);
        return root.val;
    }

    private int count(TreeNode root) {
        if (root == null)
            return 0;
        return count(root.left)+count(root.right)+1;
    }
}
