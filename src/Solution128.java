import java.util.HashSet;
import java.util.Set;

/**
 * Created by cuibowu on 2017/8/24.
 */
public class Solution128 {
    public int longestConsecutive(int[] nums) {
        int res=0;
        Set<Integer> set = new HashSet<>();
        for(int i:nums)
            set.add(i);
        for(int i:nums){
            if(!set.contains(i-1)){
                int j=i+1;
                while (set.contains(j))
                    j++;
                res = Math.max(res,j-i);
            }
        }
        return res;
    }
}
