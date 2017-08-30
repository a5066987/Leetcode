import java.util.LinkedList;
import java.util.List;

/**
 * Created by cuibowu on 2017/8/29.
 */
public class Solution66 {
    public int[] plusOne(int[] digits) {
        int flag = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1 && digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }

        int[] res= new int[digits.length+1];
        res[0]=1;
        return res;
    }
}
