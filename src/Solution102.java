import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by cuibowu on 2017/8/25.
 */
public class Solution102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<TreeNode> temp = new LinkedList<>();
            while (!queue.isEmpty()){
                temp.add(queue.poll());
            }
            List<Integer> r = new LinkedList<>();
            temp.forEach(node->r.add(node.val));
            res.add(r);
            temp.forEach(node->{queue.offer(node.left);queue.offer(node.right);});
        }
        return res;
    }
}
