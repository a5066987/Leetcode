import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by cuibowu on 2017/7/2.
 */

public class Main {
    public static void main(String[] args) {
        Solution139 solution139 = new Solution139();
        String s ="leetcode";
        List<String> list = new ArrayList<>();
        list.add("leet");
        list.add("code");
        if(solution139.wordBreak(s,list)){
            System.out.println(1);
        }
    }
}
