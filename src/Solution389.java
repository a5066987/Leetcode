/**
 * Created by cuibowu on 2017/8/14.
 */
public class Solution389 {
    public char findTheDifference(String s, String t) {
        char result =0;
        for(int i =0; i<s.length();i++){
            result^=s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            result^=t.charAt(i);
        }
        return result;
    }
}
