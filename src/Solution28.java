/**
 * Created by cuibowu on 2017/9/2.
 */
public class Solution28 {
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        for(int i=0;i+len-1<haystack.length();i++){
            if(haystack.substring(i,i+len).equals(needle))
                return i;
        }
        return -1;
    }
}
