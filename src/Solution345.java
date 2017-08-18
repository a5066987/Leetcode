import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by cuibowu on 2017/8/18.
 */
public class Solution345 {
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        StringBuilder ss = new StringBuilder(s);

        for(int i=0,j=ss.length()-1;i<j;){
            if(!set.contains(ss.charAt(i))){
                i++;
                continue;
            }
            if(!set.contains(ss.charAt(j))){
                j--;
                continue;
            }
            char temp = ss.charAt(i);
            ss.replace(i,i+1,String.valueOf(ss.charAt(j)));
            ss.replace(j,j+1,String.valueOf(temp));
            i++;
            j--;
        }
        return ss.toString();

    }
}
