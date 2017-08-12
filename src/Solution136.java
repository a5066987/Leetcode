/**
 * Created by cuibowu on 2017/8/7.
 */
public class Solution136 {
    public int singleNumber(int[] nums) {
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
            result=result^nums[i];
        }
        return result;
    }
}
