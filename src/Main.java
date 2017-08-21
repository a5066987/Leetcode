import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by cuibowu on 2017/7/2.
 */

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left=new TreeNode(5);
        root.right=new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right=new TreeNode(2);
        root.left.right.left=new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right.left=new TreeNode(0);
        root.right.right=new TreeNode(8);
        Solution236 solution236 = new Solution236();
        TreeNode result = solution236.lowestCommonAncestor(root,root.left.right,root.right);
    }
}
