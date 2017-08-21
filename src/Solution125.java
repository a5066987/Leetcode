/**
 * Created by cuibowu on 2017/8/21.
 */
public class Solution125 {
    public boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i))){
                stringBuilder.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        String original = stringBuilder.toString();
        String reversed = stringBuilder.reverse().toString();
        if(original.equals(reversed))
            return true;
        return false;

    }
}
