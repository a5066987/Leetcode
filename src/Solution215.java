/**
 * Created by cuibowu on 2017/8/30.
 */
public class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        int p =select(nums,0,nums.length-1,nums.length-k+1);
        return nums[p];
    }

    private  int select(int[] nums, int left, int right,int k){
        int i=left,j=right,pivot=nums[right];
        while (i<j){
            if(nums[i++]>pivot){
                swap(nums,--i,--j);
            }
        }
        swap(nums,i,right);

        int m = i-left+1;
        if(m==k)
            return i;
        else if(m>k)
            return select(nums,left,i-1,k);
        else
            return select(nums,i+1,right,k-m);
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
