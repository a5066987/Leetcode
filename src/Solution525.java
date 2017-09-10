import java.util.HashMap;

/**
 * Created by cuibowu on 2017/9/10.
 */
public class Solution525 {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        int zero =0,one=0,len=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }else {
                one++;
            }
            if(map.containsKey(zero-one)){
                len=Math.max(len,i-map.get(zero-one));
            }else{
                map.put(zero-one,i);
            }
        }
        return len;
    }
}
