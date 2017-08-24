import java.util.Stack;

/**
 * Created by cuibowu on 2017/8/24.
 */
public class Solution130 {
    public void solve(char[][] board) {
        int[] row = {0, board.length - 1};
        int[] col = {0, board[0].length - 1};
        for (int i : row) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O')
                    markAllReachablePoint(board, i, j);
            }
        }
        for (int j : col) {
            for (int i = 1; i < board.length - 1; i++) {
                if (board[i][j] == '0')
                    markAllReachablePoint(board, i, j);
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'U')
                    board[i][j] = 'O';
                else if (board[i][j] == 'O')
                    board[i][j] = 'X';
            }
        }
    }

//    //recursive DFS can cause stack overflow
//    private void markAllNeighbor(char[][] board,int i,int j){
//        board[i][j] = 'U';
//        if(i-1>=0&&board[i-1][j]=='O')
//            markAllNeighbor(board,i-1,j);
//        if(i+1<board.length&&board[i+1][j]=='O')
//            markAllNeighbor(board,i+1,j);
//        if(j-1>=0&&board[i][j-1]=='O')
//            markAllNeighbor(board,i,j-1);
//        if(j+1<board[0].length&&board[i][j+1]=='O')
//            markAllNeighbor(board,i,j+1);
//    }

    //non-recursive DFS search
    private void markAllReachablePoint(char[][] board, int i, int j) {
        Stack<Integer[]> stack = new Stack<>();
        Integer[] initial = {i, j};
        board[i][j] = 'U';
        stack.push(initial);
        while (!stack.isEmpty()) {
            Integer[] temp = stack.pop();
            int p = temp[0], q = temp[1];
            if (p - 1 >= 0 && board[p - 1][q] == 'O') {
                board[p - 1][q] = 'U';
                Integer[] a = {p - 1, q};
                stack.push(a);
            }
            if(p+1<board.length&&board[p+1][q]=='O'){
                board[p+1][q]='U';
                Integer[] a = {p+1,q};
                stack.push(a);
            }
            if(q-1>=0&&board[p][q-1]=='O'){
                board[p][q-1]='U';
                Integer[] a = {p,q-1};
                stack.push(a);
            }
            if(q+1<board[0].length&&board[p][q+1]=='O'){
                board[p][q+1]='U';
                Integer[] a = {p,q+1};
                stack.push(a);
            }
        }
    }
}
