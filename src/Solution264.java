/**
 * Created by cuibowu on 2017/8/9.
 */
public class Solution264 {
    public int nthUglyNumber(int n) {
        int[] uglyNumber = new int[n];
        uglyNumber[0] = 1;
        int index2=0,index3=0,index5=0;
        for(int i=1;i<n;i++){
            int min = minimum(uglyNumber[index2]*2,uglyNumber[index3]*3,uglyNumber[index5]*5);
            if(min==uglyNumber[index2]*2){
                index2++;
            }
            if(min==uglyNumber[index3]*3){
                index3++;
            }
            if(min==uglyNumber[index5]*5){
                index5++;
            }
            uglyNumber[i] = min;


        }

        return uglyNumber[n-1];
    }
    int minimum(int a, int b, int c){
        int temp = Math.min(a,b);
        return Math.min(temp,c);
    }
}
