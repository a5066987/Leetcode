import com.sun.imageio.plugins.gif.GIFImageReader;

/**
 * Created by cuibowu on 2017/8/4.
 */
public class Solution463 {
    public int islandPerimeter(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0) {
                    continue;
                } else if (grid[i][j] == 1) {
                    count = count + (4 - findNeighbor(grid, i, j));
                }
            }
        }
        return count;
    }

    private int findNeighbor(int[][] grid, int i, int j) {
        int count = 0;
        if (i - 1 >= 0) {
            if (grid[i - 1][j] == 1) {
                count++;
            }
        }
        if (i + 1 < grid.length) {
            if (grid[i + 1][j] == 1) {
                count++;
            }
        }
        if(j-1>=0){
            if(grid[i][j-1]==1){
                count++;
            }
        }
        if(j+1<grid[i].length){
            if(grid[i][j+1]==1){
                count++;
            }
        }
        return count;
    }
}
