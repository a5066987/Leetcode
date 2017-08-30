/**
 * Created by cuibowu on 2017/8/30.
 */
public class Solution198 {
    public int rob(int[] nums) {
        int robThis =0;
        int notRobThis =0;
        for(int i=0;i<nums.length;i++){
            int rob = notRobThis+nums[i];
            notRobThis = Math.max(notRobThis,robThis);
            robThis = rob;
        }
        return Math.max(robThis,notRobThis);
    }

}
