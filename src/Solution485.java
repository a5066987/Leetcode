import java.util.ArrayList;

/**
 * Created by cuibowu on 2017/8/7.
 */
public class Solution485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result=0;
        int count = 0;
//        for(int j=0;j<nums.length;j++){
//            if(nums[j]==0)
//                break;
//            if(j== nums.length-1&&nums[j]!=0)
//                return nums.length;
//        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1)
                count++;
            else {
                if(count>result)
                    result=count;
                count=0;
            }
            if(i==nums.length-1&&count>result)
                return count;
        }
        return result;
    }
}
