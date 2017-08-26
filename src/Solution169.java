/**
 * Created by cuibowu on 2017/8/26.
 */
public class Solution169 {
    public int majorityElement(int[] num){
        int count=1,majority=num[0];
        for(int i=1;i<num.length;i++){
            if(count==0){
                count++;
                majority=num[i];
            }
            else if (num[i]==majority)
                count++;
            else {
                count--;
            }
        }
        return majority;

    }
}
