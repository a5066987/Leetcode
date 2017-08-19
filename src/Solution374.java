/**
 * Created by cuibowu on 2017/8/18.
 */
public class Solution374 {
    public int guessNumber(int n) {
        int low = 1, high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (guess(mid) == 0)
                return mid;
            else if (guess(mid) == -1) {
                high = mid - 1;
            } else if (guess(mid) == 1) {
                low = mid + 1;
            }
        }
        return -1;
    }

    int guess(int n){
        return 0;
    }
}
