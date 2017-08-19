import java.util.LinkedList;
import java.util.List;

/**
 * Created by cuibowu on 2017/8/19.
 */
public class Solution257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new LinkedList<>();
        if(root!=null)
            searchPath(root,result,"");
        return result;
    }

    private void  searchPath(TreeNode root, List<String> result, String currentPath){
        currentPath += root.val;
        if(root.left==null&&root.right==null)
            result.add(currentPath);
        if(root.left!=null)
            searchPath(root.left,result,currentPath+"->");
        if(root.right!=null)
            searchPath(root.right,result,currentPath+"->");
    }
}
