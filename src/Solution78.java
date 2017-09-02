import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by cuibowu on 2017/9/2.
 */
public class Solution78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for(int i:nums){
            List<List<Integer>> temp = new ArrayList<>();
            for(List<Integer> list : res){
                List<Integer> a = new ArrayList<>(list);
                a.add(i);
                temp.add(a);
            }
            res.addAll(temp);
        }
        return res;
    }
}
