import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by cuibowu on 2017/9/3.
 */
public class Solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        Stack<TreeNode> stack= new Stack<>();
        TreeNode t = root;
        do {
            while (null != t){
                stack.push(t);
                t=t.left;
            }
            t = stack.pop();
            res.add(t.val);
            t=t.right;
        }while (!stack.isEmpty());
        return res;

    }

//    private void inorderTraversal(TreeNode root, List<Integer> res){
//        if(root==null)
//            return;
//        inorderTraversal(root.left,res);
//        res.add(root.val);
//        inorderTraversal(root.right,res);
//    }
}
