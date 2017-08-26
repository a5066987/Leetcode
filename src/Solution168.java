import java.util.HashMap;
import java.util.Map;

/**
 * Created by cuibowu on 2017/8/25.
 */
public class Solution168 {
    public String convertToTitle(int n) {
        StringBuilder res = new StringBuilder();
        while (n!=0){
            res.insert(0,(char)('A'+(--n)%26));
            n/=26;
        }

        return res.toString();

    }
}
