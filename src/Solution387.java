/**
 * Created by cuibowu on 2017/9/5.
 */
public class Solution387 {
    public int firstUniqChar(String s) {
        int[] dict= new  int[24];
        for(char c:s.toCharArray()){
            dict[c-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(dict[s.charAt(i)-'a']==1)
                return i;
        }
        return -1;
    }
}
