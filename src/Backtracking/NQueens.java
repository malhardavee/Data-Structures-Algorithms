package Backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        char[][] board  = new char[n][n];

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        nqueens(board, 0);
    }

    private static void nqueens(char[][] board, int row){
        int n = board.length;
        if (row == n){
            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for (int j=0;j<n;j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                nqueens(board, row+1);
                board[row][j] = '.'; /// backtracking
            }

        }
    }
    private static boolean isSafe(char[][] board, int row, int col){
        // check the row
        int n = board.length;
        for (int j = 0; j<n;j++){
            if (board[row][j] == 'Q') return false;
        }
        // check col
        for (int i=0;i<n;i++){
            if (board[i][col] == 'Q') return false;
        }
        // check N-E
        int i=row;
        int j = col;
        while (i >= 0 && j < n){
            if (board[i][j] == 'Q') return false;
            i--;
            j++;
        }
        // check S-E
        i = row;
        j = col;
        while (i < n && j < n){
            if (board[i][j] == 'Q') return false;
            i++;
            j++;
        }

        // check N-W
        i = row;
        j = col;
        while (i >= 0 && j >= 0){
            if (board[i][j] == 'Q') return false;
            i--; j--;
        }

        // check S-W
        i = row;
        j = col;
        while (i < n && j >= 0){
            if (board[i][j] == 'Q') return false;
            i++; j--;
        }
        return true;
    }
}
