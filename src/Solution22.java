import java.util.ArrayList;
import java.util.List;

/**
 * Created by cuibowu on 2017/9/3.
 */
public class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generateParenthesis(res,"",0,0,n);
        return res;
    }
    private void generateParenthesis(List<String> res, String s, int left, int right, int n){
        if(left==n&&right==n) {
            res.add(s);
            return;
        }
        if(left<n)
            generateParenthesis(res,s+"(",left+1,right,n);
        if(right<left)
            generateParenthesis(res,s+")",left,right+1,n);
    }
}
