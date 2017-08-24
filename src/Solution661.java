/**
 * Created by cuibowu on 2017/8/24.
 */
public class Solution661 {
    public int[][] imageSmoother(int[][] M) {
        int m=M.length,n=M[0].length;
        int[][] res = new int[m][n];
        for(int i=0;i<m;i++){
            for (int j =0;j<n;j++){
                int sum =0,count=0;
                for(int p=i-1;p<i+2;p++){
                    for(int q=j-1;q<j+2;q++){
                        if(p<0||q<0||p>=m||q>=n)
                            continue;
                        sum+=M[p][q];
                        count++;
                    }
                }
                res[i][j]=sum/count;
            }
        }
        return res;
    }
}
