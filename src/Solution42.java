/**
 * Created by cuibowu on 2017/8/25.
 */
public class Solution42 {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1, level = 0, water = 0;
        while (left < right) {
            int lower = 0;
            if (height[left] < height[right]) {
                lower = height[left++];
            } else {
                lower=height[right--];
            }
            level = Math.max(level,lower);
            water+=level-lower;
        }
        return water;
    }
}
