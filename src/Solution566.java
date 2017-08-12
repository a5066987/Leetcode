/**
 * Created by cuibowu on 2017/8/1.
 */
public class Solution566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            length += nums[i].length;
        }
        if ((r * c) > length) {
            return nums;
        }
        else {
            int[][] result = new int[r][c];
            int[] temp = new int[length];
            int index = 0;
            for(int i=0;i<nums.length;i++){
                for(int j=0;j<nums[i].length;j++){
                    temp[index]=nums[i][j];
                    index++;
                }
            }
            index = 0;
            for(int i =0;i<r;i++){
                for(int j=0;j<c;j++){
                    result[i][j]=temp[index];
                    index++;
                }
            }
            return result;
        }
    }
}
