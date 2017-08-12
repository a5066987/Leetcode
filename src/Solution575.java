import java.util.Arrays;

/**
 * Created by cuibowu on 2017/8/4.
 */
public class Solution575 {
    public int distributeCandies(int[] candies) {
        int length = candies.length;
        Arrays.sort(candies);
        int flag = 0;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                flag = candies[i];
                count++;
            } else {
                if (candies[i] == flag) {
                    continue;
                } else if (candies[i]!=flag){
                    count++;
                    flag=candies[i];
                }
            }
        }
        if(count<(length/2)){
            return count;
        }
        else {
            return (length/2);
        }
    }
}
