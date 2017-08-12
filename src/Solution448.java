import java.util.ArrayList;
import java.util.List;

/**
 * Created by cuibowu on 2017/8/7.
 */
public class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            list.add(i);
        }
        for(int i=0;i<nums.length;i++){
            Integer a =new Integer(nums[i]);
            list.remove(a);
        }
        return list;
    }
}
