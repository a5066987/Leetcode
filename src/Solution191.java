/**
 * Created by cuibowu on 2017/9/9.
 */
public class Solution191 {

    public int hammingWeight(int n) {
        int count=0;
        while (n!=0){
            if((n&1)==1)
                count++;
            n=n>>>1;
        }
        return count;
    }
}
