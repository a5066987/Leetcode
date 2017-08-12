/**
 * Created by cuibowu on 2017/8/7.
 */
public class Solution520 {
    public boolean detectCapitalUse(String word) {
        if(word.matches("([A-Z]*)|([a-z]*)|(^[A-Z][a-z]*)"))
            return true;
        else
            return false;
    }
}
