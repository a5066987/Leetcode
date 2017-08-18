import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by cuibowu on 2017/7/2.
 */

public class Main {
    public static void main(String[] args) {
        Solution347 solution347 = new Solution347();
        String s = "(a)())()";
        List<String> list = solution347.removeInvalidParentheses(s);
    }
}
