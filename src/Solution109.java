import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by cuibowu on 2017/8/24.
 */
public class Solution109 {
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head!=null){
            list.add(head.val);
            head=head.next;
        }
        int[] array = list.stream().mapToInt(i->i).toArray();
        return toBST(array,0,array.length-1);

    }
    private TreeNode toBST(int[] array,int low, int high){
        if(low>high)
            return null;
        int mid = (int) Math.ceil(low+(double) (high-low)/2);
        TreeNode root = new TreeNode(array[mid]);
        root.left = toBST(array,low,mid-1);
        root.right=toBST(array,mid+1,high);
        return root;
    }
}
