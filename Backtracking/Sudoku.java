public class Solution {

    public static void main(String args[]){
        char[][] board = {
    {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
    {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
    {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
    {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
    {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
    {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
    {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
    {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
    {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
};

        if(solve(board,0,0)){
            System.out.println("Solution is there");
        }else{
            System.out.println("No solution is there");
        }
    }
    public boolean solve(char[][] board, int row, int col) {

        //base
        if(row == 9){
            return true;
        }

        //recursion
        int nextRow = row;
        int nextCol = col + 1;

        if(col+1 == 9){
            nextRow = row+1;
            nextCol = 0;
        }

        //if occupied
        if(board[row][col] != '.'){
            return solve(board, nextRow, nextCol);
        }

        for(char digit='1'; digit<='9'; digit++){
            if(isSafe(board, row, col, digit)){
                board[row][col] = digit;
                if(solve(board, nextRow, nextCol)){
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;

        
    }
     public static boolean isSafe(char[][] board, int row, int col, char d) {
        // row
        for(int i=0; i<9; i++){
            if(i != col && board[row][i] == d){
                return false;
            }
        }

        //col
        for(int i=0; i<9; i++){
            if(i != row && board[i][col] == d){
                return false;
            }
        }

        //grid
        int sRow = (row/3)*3;
        int sCol = (col/3)*3;
         for(int i=sRow; i<sRow+3; i++){
            for(int j=sCol; j<sCol+3; j++){
                if((i != row || j != col) && board[i][j] == d){
                    return false;
                }
            }
        } 

        return true;

    }
}