/**
 * Created by cuibowu on 2017/9/7.
 */
public class Solution122 {
    public int maxProfit(int[] prices) {
        int res = 0 ;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i+1]>prices[i])
                res+=prices[i+1]-prices[i];
            return res;
        }
    }
}
