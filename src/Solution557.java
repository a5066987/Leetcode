/**
 * Created by cuibowu on 2017/7/31.
 */
public class Solution557 {
    public String reverseWords(String s) {
        String[] results = s.split(" ");
        int flag = 0;
        StringBuilder tmp = new StringBuilder();
        int length = results.length;
        for (String i : results) {
                tmp.append(new StringBuilder(i).reverse());
                tmp.append(" ");
        }
        String reverse = tmp.toString().trim();
        return reverse;
    }
}