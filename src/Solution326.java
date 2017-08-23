/**
 * Created by cuibowu on 2017/8/23.
 */
public class Solution326 {
    public boolean isPowerOfThree(int n) {
        for(int i=0;Math.pow(3,i)<Integer.MAX_VALUE;i++){
            if(n==Math.pow(3,i)){
                return true;
            }
        }
        return false;

    }
}
