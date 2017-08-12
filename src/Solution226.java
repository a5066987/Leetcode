/**
 * Created by cuibowu on 2017/8/7.
 */
public class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;
        if (root.left == null && root.right != null) {
            root.left = root.right;
            root.right = null;
        } else if (root.left != null && root.right == null) {
            root.right = root.left;
            root.left = null;
        } else if (root.left == null && root.right == null) {
            return root;
        } else if (root.left != null && root.right != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
        root.left = invertTree(root.left);
        root.right = invertTree(root.right);
        return root;
    }
}
