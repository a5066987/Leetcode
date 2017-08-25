import java.util.Arrays;

/**
 * Created by cuibowu on 2017/8/25.
 */
public class Solution494 {
    public int findTargetSumWays(int[] nums, int S) {
        if(nums.length==0)
            return 0;
        int sum = Arrays.stream(nums).sum();
        if(S>sum||S<-sum)
            return 0;
        int[][] dp = new int[nums.length+1][2*sum+1];
        dp[0][sum]=1;
        for(int i=1;i<nums.length+1;i++){
            for(int j =0;j<2*sum+1;j++){
                if(j-nums[i-1]>=0){
                    dp[i][j]+=dp[i-1][j-nums[i-1]];
                }
                if(j+nums[i-1]<=2*sum){
                    dp[i][j]+=dp[i-1][j+nums[i-1]];
                }
            }
        }
        return dp[nums.length][sum+S];
    }
}
