import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cuibowu on 2017/8/9.
 */
public class Solution119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result =  new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            result.add(combination(rowIndex,i));
        }
        return result;
    }
     public int combination(int n, int k){
        BigInteger top = new BigInteger("1");
        BigInteger bottom = new BigInteger("1");
        for(int i=0;i<k;i++){
            top = top.multiply(new BigInteger(Integer.toString(n)));
            n--;
        }
        for(int i=1;i<=k;i++){
            bottom = bottom.multiply((new BigInteger(Integer.toString(i))));
        }
        BigInteger result = top.divide(bottom);

        return result.intValue();
    }
}
