/**
 * Created by cuibowu on 2017/8/25.
 */
public class Solution91 {
    public int numDecodings(String s) {
        int[] dp = new int[s.length()+1];
        dp[0]=1;
        if(s.charAt(0)!='0')
            dp[1]=1;
        else
            dp[1]=0;
        for(int i=2;i<dp.length;i++){
            String one = s.substring(i-1,i);
            String two = s.substring(i-2,i);
            int oneValue = Integer.valueOf(one);
            int twoValue = Integer.valueOf(two);
            if(oneValue>=1&&oneValue<=9)
                dp[i]+=dp[i-1];
            if(twoValue>=10&&twoValue<=26)
                dp[i]+=dp[i-2];
        }
        return dp[s.length()];
    }
}
