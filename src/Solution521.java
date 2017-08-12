/**
 * Created by cuibowu on 2017/8/6.
 */
public class Solution521 {
    public int findLUSlength(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();
        if (lengthA != lengthB)
            return Math.max(lengthA, lengthB);
        else {
            if(a.equals(b))
                return  -1;
            else
                return lengthA;
        }
    }
}
