import java.util.List;

/**
 * Created by cuibowu on 2017/8/19.
 */
public class Solution139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] wordBreaker = new boolean[s.length() + 1];
        wordBreaker[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (String ss:
                 wordDict) {
                if(ss.length()<=i){
                    if(wordBreaker[i-ss.length()]==true){
                        if(s.substring(i-ss.length(),i).equals(ss)){
                            wordBreaker[i]=true;
                            break;
                        }
                    }
                }
            }
        }
        return wordBreaker[s.length()];
    }

}
