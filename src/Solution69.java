/**
 * Created by cuibowu on 2017/8/21.
 */
public class Solution69 {
    public int mySqrt(int x) {
        if (x == 0)
            return 0;
        for (int low = 1, high = x; low <= high; ) {
            int mid = low + (high - low) / 2;
            if (Math.pow(mid, 2) <= x && Math.pow(mid + 1, 2) > x)
                return mid;
            else if (Math.pow(mid,2)<x&&Math.pow(mid+1,2)<=x){
                low=mid+1;
                continue;
            }
            else if(Math.pow(mid,2)>x&&Math.pow(mid+1,2)>x){
                high=mid-1;
                continue;
            }
        }
        return -1;
    }
}
