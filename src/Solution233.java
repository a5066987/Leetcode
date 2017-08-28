/**
 * Created by cuibowu on 2017/8/28.
 */
public class Solution233 {
    public int countDigitOne(int n) {
        int res = 0;
        for (int i = 1; i <= n; i *= 10) {
            int s = n / i, t = n % i;
            res += (s + 8) / 10 * i + (s % 10 == 1 ? t + 1 : 0);
        }
        return res;
    }
}
