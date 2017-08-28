import java.util.LinkedList;
import java.util.List;

/**
 * Created by cuibowu on 2017/8/28.
 */
public class Solution260 {
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        int xor = 0;
        for (int i : nums) {
            xor ^= i;
        }
        int bit = xor & -xor;
        for (int i=0;i<nums.length;i++){
            if((i&bit)==0){
                res[0] ^=i;
            }
            else
                res[1]^=i;
        }
        return res;

    }
}
