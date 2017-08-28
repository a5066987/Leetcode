/**
 * Created by cuibowu on 2017/8/28.
 */
public class Solution338 {
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        res[0] = 0;
        res[1] = 1;
//        int exp=0;
        for (int i = 2; i <= num; i++) {
            res[i] = res[i >> 1] + i % 2;
        }
        return res;
    }
}
