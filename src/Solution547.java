/**
 * Created by cuibowu on 2017/8/26.
 */
public class Solution547 {
    public int findCircleNum(int[][] M) {
        int flag = 2;
        for (int i=0;i<M.length;i++){
            if(M[i][i]==1) {
                markAllFriends(M,i,flag);
                flag++;
            }
        }
//        int min=flag;
//        for(int i=0;i<M.length;i++){
//            if(M[i][i]<min)
//                min=M[i][i];
//        }
        return flag-2;
    }

    private void markAllFriends(int[][] M, int row, int flag) {
        if (M[row][row] == flag)
            return;
        else
            M[row][row] = flag;
        for (int i = 0; i < M.length; i++) {
            if (M[row][i] == 1)
                markAllFriends(M, i, flag);
        }

    }
}
