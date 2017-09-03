/**
 * Created by cuibowu on 2017/9/3.
 */
public class Solution121 {
    public int maxProfit(int[] prices) {
        int maxEndingHere = 0, maxSoFar = 0;
        for (int i = 1; i <prices.length;i++){
            maxEndingHere+=prices[i]-prices[i-1];
            maxEndingHere=Math.max(0,maxEndingHere);
            maxSoFar= Math.max(maxSoFar,maxEndingHere);
        }
        return maxSoFar;
    }
}
