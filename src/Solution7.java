/**
 * Created by cuibowu on 2017/8/17.
 */
public class Solution7 {
    public int reverse(int x) {
        long y =x;
        if (y == 0)
            return 0;
        StringBuilder stringBuilder = new StringBuilder();
        if (y < 0) {
            stringBuilder.append("-");
            y=Math.abs(y);
        }
        while (y != 0) {
            long temp = y % 10;
            stringBuilder.append(temp);
            y=(y-temp)/10;
        }
        String string  = stringBuilder.toString();
        long a = Long.parseLong(string);
        if(a>2147483647||a<-2147483648)
            return 0;
        else
            return (int)a;
    }
}
