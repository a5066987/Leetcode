import java.util.HashSet;
import java.util.Set;

/**
 * Created by cuibowu on 2017/9/4.
 */
public class Solution202 {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);
        while (n!=1){
            n=process(n);
            if(set.contains(n))
                return false;
            else
                set.add(n);

        }
        return true;
    }

    private int process(int num){
        int res=0;
        while (num!=0){
            int tmp = num%10;
            res+=Math.pow(tmp,2);
            num/=10;
        }
        return res;
    }
}
