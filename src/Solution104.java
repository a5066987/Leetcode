/**
 * Created by cuibowu on 2017/8/26.
 */
public class Solution104 {
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
    }

}
