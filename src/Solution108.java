import java.util.Stack;

/**
 * Created by cuibowu on 2017/9/4.
 */
public class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums,0,nums.length-1);
    }
    private TreeNode sortedArrayToBST(int[] nums,int low,int high){
        if(low>high)
            return null;
        int mid =(int)Math.ceil(low +(double)(high-low)/2);
        TreeNode root = new TreeNode(nums[mid]);
        root.left=sortedArrayToBST(nums,low,mid-1);
        root.right=sortedArrayToBST(nums,mid+1,high);
        return root;
    }
}
