import java.util.ArrayList;
import java.util.List;

/**
 * Created by cuibowu on 2017/8/7.
 */
public class Solution653 {
    public boolean findTarget(TreeNode root, int k) {
        if(root==null)
            return false;
        List<Integer> list = new ArrayList<>();
        toArray(root,list);
        int i=0,j=list.size()-1;
        while(i<j){
            int sum = list.get(i)+list.get(j);
            if(sum<k){
                i++;
            }else if(sum>k){
                j--;
            }else if(sum==k){
                return true;
            }
        }
        return false;
    }
    private void toArray(TreeNode root, List<Integer> list){
        toArray(root.left, list);
        list.add(root.val);
        toArray(root.right,list);
    }
}
