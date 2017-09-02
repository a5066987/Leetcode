/**
 * Created by cuibowu on 2017/9/2.
 */
public class Solution98 {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private boolean isValidBST(TreeNode root, int min, int max){
        if(root==null)
            return true;
        if(root.val>=max||root.val<=min)
            return false;
        return isValidBST(root.left,min,root.val)&&isValidBST(root.right,root.val,max);
    }
}
