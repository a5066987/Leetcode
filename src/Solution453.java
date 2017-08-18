import java.util.stream.IntStream;

/**
 * Created by cuibowu on 2017/8/15.
 */
public class Solution453 {
    public int minMoves(int[] nums) {
        int min = IntStream.of(nums).min().getAsInt();
        int sum = IntStream.of(nums).sum();
        return sum-min*nums.length;
    }
}
