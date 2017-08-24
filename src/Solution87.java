/**
 * Created by cuibowu on 2017/8/24.
 */
public class Solution87 {
    public boolean isScramble(String s1, String s2) {
        if (s1.equals(s2))
            return true;
        if (s1.length() != s2.length())
            return false;

        int[] checkLetters = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            checkLetters[s1.charAt(i) - 'a']++;
            checkLetters[s2.charAt(i) - 'a']--;
        }
        for (int i : checkLetters) {
            if (i != 0)
                return false;
        }
        for (int i = 1; i < s1.length(); i++) {
            if (isScramble(s1.substring(0, i), s2.substring(0, i)) && isScramble(s1.substring(i), s2.substring(i)))
                return true;
            if (isScramble(s1.substring(0, i), s2.substring(s2.length() - i)) && isScramble(s1.substring(i), s2.substring(0, s2.length() - i)))
                return true;
        }
        return false;
    }
}
