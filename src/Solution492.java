/**
 * Created by cuibowu on 2017/8/15.
 */
public class Solution492 {
    public int[] constructRectangle(int area) {
        int x=area,y=1;
        int min=x-y;
        for(int i=1;i<=Math.sqrt(area);i++){
            if(area%i==0){
                if(area/i-i<min){
                    x=area/i;
                    y=i;
                    min=x-y;
                }
            }
        }
        int[] result = {x,y};
        return result;
    }
}
