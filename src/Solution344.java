import java.util.Arrays;

/**
 * Created by cuibowu on 2017/8/30.
 */
public class Solution344 {
    public String reverseString(String s) {
        char[] word = s.toCharArray();
        for (int i = 0, j = s.length() - 1; i < j; ) {
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
        }
        return Arrays.toString(word);
    }
}
