/**
 * Created by cuibowu on 2017/8/14.
 */
public class Solution606 {
    StringBuilder result = new StringBuilder();

    public String tree2str(TreeNode t) {
        newTree2str(t);
        return result.toString();

    }
    void newTree2str(TreeNode t) {
        result.append(t.val);
        result.append("(");
        if (t.left != null)
            result.append(tree2str(t.left));
        result.append(")");
        if (t.right != null) {
            result.append("(");
            result.append(tree2str(t.right));
            result.append(")");
        }
    }
}


