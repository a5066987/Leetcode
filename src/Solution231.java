/**
 * Created by cuibowu on 2017/8/20.
 */
public class Solution231 {
    public boolean isPowerOfTwo(int n) {
        for(int i =0; Math.pow(2,i)<=n;i++){
            if(Math.abs(n)==Math.pow(2,i))
                return true;
        }
        return false;
    }
}
