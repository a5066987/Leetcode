import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by cuibowu on 2017/8/4.
 */
public class Solution496 {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int[] result = new int[findNums.length];
        for (int i = 0; i < findNums.length; i++) {
            int index = list.indexOf(findNums[i]);
            if (index == -1) {
                result[i] = -1;
                continue;
            } else {
                if(index==nums.length-1){
                    result[i]=-1;
                    continue;
                }
                for(int j=index+1;j<nums.length;j++){
                    if(nums[j]>findNums[i]){
                        result[i]=nums[j];
                        break;
                    }
                    if(j==nums.length-1){
                        result[i]=-1;
                        break;
                    }
                }
            }

        }
        return result;
    }
}
