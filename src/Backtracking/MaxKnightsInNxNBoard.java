package Backtracking;

public class MaxKnightsInNxNBoard {
    private static boolean isSafe(char[][] board, int row, int col){
        int n = board.length;
        // 2 UP 1 RIGHT
        int i= row -2;
        int j = col + 1;
        if (board[i][j] == 'K' && i >= 0 && j < n) return false; // changed Q -> K

        // 2 UP 1 LEFT
        i = row - 2;
        j = col - 1;
        if (board[i][j] == 'K' && i >= 0 && j >= 0) return false; // changed Q -> K

        // 2 DOWN 1 RIGHT
        i = row + 2;
        j = col + 1;
        if (board[i][j] == 'K' && i < n && j < n) return false; // changed Q -> K

        // 2 DOWN 1 LEFT
        i = row + 2;
        j = col - 1;
        if (i < n && j >= 0 && board[i][j] == 'K') return false; // changed Q -> K

        // 2 RIGHT 1 UP
        i= row - 1;
        j = col + 2;
        if (i >= 0 && j < n && board[i][j] == 'K') return false; // changed Q -> K

        // 2 RIGHT 1 DOWN
        i= row + 1;
        j = col + 2;
        if (i < n && j < n && board[i][j] == 'K') return false; // changed Q -> K

        // 2 LEFT 1 UP
        i= row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && board[i][j] == 'K') return false; // changed Q -> K

        // 2 LEFT 1 DOWN
        i= row + 1;
        j = col - 2;
        if (i < n && j >= 0 && board[i][j] == 'K') return false; // changed Q -> K
        return true;
    }

    static int maxKnights = -1;

    public static void NKnight(char[][]board, int row, int col, int num){
        int n = board.length;

        if(row == n){
            for (int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            maxKnights = Math.max(maxKnights,num);
            return; // added return to stop further recursion
        }

        if (isSafe(board, row, col)){
            board[row][col] = 'K';
            if (col != n-1)
                NKnight(board, row, col+1, num+1);
            else NKnight(board, row+1, 0, num+1); // fixed row increment
            board[row][col] = 'x'; // reset after backtrack
        }
        if (col != n-1)
            NKnight(board, row, col+1, num);
        else
            NKnight(board, row+1, 0, num);
    }

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                board[i][j] = 'x'; // fixed: start empty, not 'K'
            }
        }
        NKnight(board, 0, 0, 0);
        System.out.println(maxKnights);
    }
}
