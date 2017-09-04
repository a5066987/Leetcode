import java.util.HashSet;
import java.util.Set;

/**
 * Created by cuibowu on 2017/9/4.
 */
public class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            if(set.contains(i))
                return true;
            else
                set.add(i);
        }
        return false;
    }
}
