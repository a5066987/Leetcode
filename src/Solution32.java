import java.util.Stack;

/**
 * Created by cuibowu on 2017/8/26.
 */
public class Solution32 {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int max =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
                stack.push(i);
            else {
                if(!stack.isEmpty()){
                    if(s.charAt(stack.peek())=='(')
                        stack.pop();
                    else
                        stack.push(i);
                }
                else
                    stack.push(i);
            }
        }
        if(stack.isEmpty())
            return s.length();
        else {
            int right=s.length(),left=0;
            while (!stack.isEmpty()){
                left = stack.pop();
                max=Math.max(max,right-left-1);
                right=left;
            }
            max=Math.max(right,max);
        }
        return max;
    }
}
