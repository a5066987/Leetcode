import java.util.Stack;

/**
 * Created by cuibowu on 2017/8/30.
 */
public class Solution85 {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null)
            return 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[] height = new int[n + 1];
        int max = 0;
        for (int row = 0; row < m; row++) {
            Stack<Integer> stack = new Stack<>();
            for (int i=0;i<n+1;i++){
                if(i<n) {
                    if (matrix[row][i] == '1')
                        height[i]++;
                    else
                        height[i]=0;
                }
                if(stack.isEmpty()||height[stack.peek()]<height[i]){
                    stack.push(i);
                }
                else {
                    while (!stack.isEmpty()&&height[i]<height[stack.peek()]){
                        int top=stack.pop();
                        int area = height[top]*(stack.isEmpty()?i:(i-stack.peek()-1));
                        if(area>max)
                            max=area;
                    }
                }
                stack.push(i);
            }
        }
        return max;
    }

}
