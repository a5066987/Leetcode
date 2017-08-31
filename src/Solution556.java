import java.util.Arrays;

/**
 * Created by cuibowu on 2017/8/31.
 */
public class Solution556 {
    public int nextGreaterElement(int n) {
        char[] number = String.valueOf(n).toCharArray();

        int i=0,j=0;
        for(i=number.length-1;i>0;i--){
            if(number[i-1]<number[i]){
                break;
            }
        }
        if(i==0)
            return -1;
        int x=number[i-1], min =i;
        for(j=i+1;i<number.length;j++){
            if(number[j]>x&&number[j]<=number[min]){
                min=j;
            }
        }

        char temp = number[i-1];
        number[i-1]=number[min];
        number[min]= temp;

        Arrays.sort(number,i,number.length);

        long res = Long.parseLong(new String(number));
        if(res>Integer.MAX_VALUE)
            return -1;
        else
            return (int)res;

    }
}
