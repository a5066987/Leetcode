/**
 * Created by cuibowu on 2017/8/22.
 */
public class Solution319 {
    public int bulbSwitch(int n) {
//        int dp[] = new int[n+1];
//        dp[0] = 0;
//        dp[1] = 1;
//        for(int i=2;i<=n;i++){
//            int count =0;
//            int s = (int)Math.sqrt(i);
//            for(int j=2;j<=s;j++){
//                if(i%j==0)
//                    count+=2;
//            }
//            if(s*s!=i)
//                count++;
//            if(count%2==0){
//                dp[i]=dp[i-1]+1;
//            }
//            else{
//                dp[i]=dp[i-1];
//            }
//        }
//        return dp[n];
        return (int)Math.sqrt(n);
    }
}
