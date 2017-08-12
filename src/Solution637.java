import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by cuibowu on 2017/8/5.
 */
public class Solution637 {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<Double> result = new ArrayList<Double>();
        queue.offer(root);
        while (queue.size() != 0) {
            int i = 0;
            int size = queue.size();
            long sum = 0;
            for (; i < size; i++) {
                TreeNode tempNode = queue.poll();
                sum += tempNode.val;
                if (tempNode.left != null)
                    queue.offer(tempNode.left);
                if (tempNode.right != null)
                    queue.offer(tempNode.right);
            }
            Double avg = new Double((double)sum /(double) size);
            result.add(avg);
        }
        return result;
    }
}
