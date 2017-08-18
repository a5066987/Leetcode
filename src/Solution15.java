import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by cuibowu on 2017/8/17.
 */
public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int sum = - nums[i];
                for(int low=i+1,high=nums.length-1;low<high;){
                    if(nums[low]+nums[high]==sum){
                        lists.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        while (low<high&&nums[low]==nums[low+1])
                            low++;
                        while ((low<high&&nums[high]==nums[high-1]))
                            high--;
                        low++;
                        high--;
                    }else if(nums[low]+nums[high]>sum){
                        high--;
                    }else if (nums[low]+nums[high]< sum){
                        low++;
                    }
                }
            }
        }
        return lists;
    }
}
