import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * Created by cuibowu on 2017/8/15.
 */
public class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> result = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i = 0 ;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                result.add(nums2[i]);
            }else {
                continue;
            }
        }
        int[] result0 = result.stream().mapToInt(integer->integer.intValue()).toArray();
        return result0;
    }
}
