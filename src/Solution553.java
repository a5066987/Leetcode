/**
 * Created by cuibowu on 2017/9/10.
 */
public class Solution553 {
    public String optimalDivision(int[] nums) {
        StringBuilder sb = new StringBuilder();
        if(nums.length==0)
            return sb.toString();
        sb.append(nums[0]);
        if(nums.length==1)
            return sb.toString();
        if(nums.length==2)
            return sb.append("/"+nums[1]).toString();
        sb.append("/("+nums[1]);
        for(int i=2;i<nums.length;i++){
            sb.append("/"+nums[i]);
        }
        sb.append(")");
        return sb.toString();

    }
}
