/**
 * Created by cuibowu on 2017/8/14.
 */


public class Solution538 {
    int sum=0;
    public TreeNode convertBST(TreeNode root) {
        if(root==null)
            return root;
        root.right=convertBST(root.right);
        root.val+=sum;
        sum=root.val;
        root.left=convertBST(root.left);
        return root;
    }
}
