import java.util.Stack;

/**
 * Created by cuibowu on 2017/8/30.
 */
public class Solution227 {
    public int calculate(String s) {
        if(s.length()==0)
            return 0;
        Stack<Integer> stack = new Stack<>();
        int k=0;
        char operator = '+';
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                k = k*10+s.charAt(i)-'0';
            }
            if(!Character.isDigit(s.charAt(i))&&s.charAt(i)!=' '||i==s.length()-1){
                switch (operator){
                    case '-':
                        stack.push(-k);
                        break;
                    case '+':
                        stack.push(k);
                        break;
                    case '*':
                        stack.push(stack.pop()*k);
                        break;
                    case '/':
                        stack.push(stack.pop()/k);
                        break;
                }
                operator=s.charAt(i);
                k=0;
            }
        }
        int res=0;
        while(!stack.isEmpty()){
            res+=stack.pop();
        }
        return res;
    }
}
