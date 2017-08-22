    import java.util.Comparator;
    import java.util.LinkedList;
    import java.util.List;
    import java.util.Queue;

    /**
     * Created by cuibowu on 2017/8/22.
     */
    public class Solution515 {
        public List<Integer> largestValues(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            List<List<Integer>> rowValue = new LinkedList<>();
            queue.offer(root);
            levelTraversal(queue, rowValue);
            List<Integer> result = new LinkedList<>();
            for (List<Integer> row : rowValue) {
                result.add(row.stream().max(Comparator.naturalOrder()).get());
            }
            return result;
        }

        private void levelTraversal(Queue<TreeNode> queue, List<List<Integer>> rowvalue) {
            if (queue.isEmpty())
                return;
            List<TreeNode> temp = new LinkedList<>();
            List<Integer> tempValue = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode tempNode = queue.poll();
                tempValue.add(tempNode.val);
                temp.add(tempNode);
            }
            rowvalue.add(tempValue);
            for (TreeNode node : temp) {
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            levelTraversal(queue, rowvalue);
        }
    }
