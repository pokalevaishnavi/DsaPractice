class Solution {
    public static int totalNQueens(int n) {
        char board[][] = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }         
        int count = nQueens(board, 0, 0);
        return count;        
    }

    public static int nQueens(char[][] board, int row, int count){
        if(row == board.length){
            count++;
            return count;
        }

        for(int i = 0; i < board.length; i++){
            if(isSafe(board, row, i)){
                board[row][i] = 'Q';
                count = nQueens(board, row + 1, count);  // FIXED
                board[row][i] = '.';
            }
        }
        return count;
    }

    public static boolean isSafe(char[][] board, int row, int col){
        // check column above
        for(int i = row - 1; i >= 0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // check left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // check right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }
}
