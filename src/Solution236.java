import java.util.StringTokenizer;

/**
 * Created by cuibowu on 2017/8/21.
 */
public class Solution236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        StringBuilder pathP = new StringBuilder();
        StringBuilder pathQ = new StringBuilder();
        findPath(root,p,"",pathP);
        findPath(root,q,"",pathQ);
        StringTokenizer stPathP = new StringTokenizer(pathP.toString());
        StringTokenizer stPathQ = new StringTokenizer(pathQ.toString());
        TreeNode ancestor =root;
        while (stPathP.hasMoreTokens()&&stPathQ.hasMoreTokens()){
            String a = stPathP.nextToken();
            String b = stPathQ.nextToken();
            if(a.equals(b)){
                if(a.equals("left")){
                    ancestor = ancestor.left;
                }
                else {
                    ancestor=ancestor.right;
                }
            }
            else {
                break;
            }
        }
        return ancestor;

    }

    private void findPath(TreeNode root,TreeNode target,String currentPath,StringBuilder path){
        if(root==null){
            return;
        }
        if(root.val==target.val){
            path.append(currentPath);
        }
        else {
            findPath(root.left,target,currentPath+"left ",path);
            findPath(root.right,target,currentPath+"right ",path);
        }
    }
}
