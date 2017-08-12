import java.util.*;

public class Solution500 {
    public char[] a = new char[]{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
    public char[] b = new char[]{'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
    public char[] c = new char[]{'z', 'x', 'c', 'v', 'b', 'n', 'm'};

    public String[] findWords(String[] words) {
        int length = words.length;
        List<String> result = new ArrayList<String>();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < 10; i++) {
            map.put(a[i], 1);
        }
        for (int i = 0; i < 9; i++) {
            map.put(b[i], 2);
        }
        for (int i = 0; i < 7; i++) {
            map.put(c[i], 3);
        }
        int row = 0;
        for (int i = 0; i < length; i++) {
            String word = words[i].toLowerCase();
            int len = word.length();
            int j = 0, flag = 0;
            for (; j < len; j++) {
                if (flag == 0) {
                    row = map.get(word.charAt(j));
                    flag = 1;
                } else {
                    if (map.get(word.charAt(j)) != row) {
                        break;
                    }
                }
            }
            if (j == len)
                result.add(words[i]);
        }
        int size = result.size();
        String[] resultt = new String[size];
        for (int i = 0; i < size; i++)
            resultt[i] = result.get(i);
        return resultt;

    }
}