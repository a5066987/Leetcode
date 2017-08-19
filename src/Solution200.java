
/**
 * Created by cuibowu on 2017/8/19.
 */
public class Solution200 {
    public int numIslands(char[][] grid) {
        int count =0;
        if(grid.length==0) return 0;
        for(int i = 0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    markIsland(i,j,grid);
                    count++;
                }
            }
        }
        return count;
    }
    private void markIsland(int i, int j, char[][] grid){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]!='1')
            return;
        grid[i][j]='0';
        markIsland(i-1,j,grid);
        markIsland(i+1,j,grid);
        markIsland(i,j-1,grid);
        markIsland(i,j+1,grid);

    }
}
