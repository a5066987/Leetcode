import java.util.StringTokenizer;

/**
 * Created by cuibowu on 2017/8/21.
 */
public class Solution236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||root==p||root==q)
            return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left!=null&&right!=null)
            return root;
        else if(left!=null&&right==null){
            return left;
        }
        else
            return right;
    }
}
