/**
 * Created by cuibowu on 2017/8/14.
 */
public class Solution283 {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                count++;
            else
                nums[i - count] = nums[i];
        }
        for (int i = nums.length - 1; i > nums.length - 1 - count; i--)
            nums[i] = 0;
    }
}
