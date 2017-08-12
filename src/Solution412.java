/**
 * Created by cuibowu on 2017/8/4.
 */

import java.util.ArrayList;
import java.util.List;

public class Solution412 {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                String string = Integer.toString(i);
                result.add(string);
            }
        }
        return result;
    }
}
