/**
 * Created by cuibowu on 2017/8/30.
 */
public class Solution53 {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0]=nums[0];
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            if(dp[i-1]>0){
                dp[i]=nums[i]+dp[i-1];
            }
            else
                dp[i]=nums[i];
            max=Math.max(max,dp[i]);
        }
        return max;
    }

}
