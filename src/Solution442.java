import java.util.LinkedList;
import java.util.List;

/**
 * Created by cuibowu on 2017/8/22.
 */
class Solution442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[Math.abs(nums[i])-1]>0)
                nums[Math.abs(nums[i])-1]=-nums[Math.abs(nums[i])-1];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]*=-1;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[Math.abs(nums[i]) - 1] *= -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                result.add(i + 1);
        }
        return result;
    }
}
