/**
 * Created by cuibowu on 2017/8/14.
 */
public class Solution657 {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') {
                y++;
            } else if (moves.charAt(i) == 'D') {
                y--;
            } else if(moves.charAt(i)=='L'){
                x--;
            }else if(moves.charAt(i)=='R'){
                x++;
            }
        }
        if(x==0&&y==0)
            return true;
        else
            return false;
    }
}
