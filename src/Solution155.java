import java.util.Stack;

/**
 * Created by cuibowu on 2017/8/20.
 */
public class Solution155 {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> min = new Stack<>();
    Solution155() {

    }

    public void push(int x) {
        if(stack.isEmpty()){
            stack.push(x);
            min.push(x);
        }
        else {
            stack.push(x);
            if(x<=min.peek())
                min.push(x);
        }
    }

    public void pop() {
        int value = stack.pop();
        if(value==min.peek())
            min.pop();
    }
    public int top(){
        return stack.peek().intValue();
    }
    public int getMin(){
        return  min.peek();
    }
}
