import java.util.Stack;

/**
 * Created by cuibowu on 2017/8/19.
 */
public class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty() && (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}'))
                return false;
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
                continue;
            }
            if (s.charAt(i) == ')') {
                if (stack.pop() != '(')
                    return false;
            } else if (s.charAt(i) == ']') {
                if (stack.pop() != '[')
                    return false;
            } else if (s.charAt(i) == '}') {
                if (stack.pop() != '{')
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
