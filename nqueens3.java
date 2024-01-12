public class nqueens3 {
    public static void prntbord(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]);
            }
                System.out.println();
        }
    }
    public static boolean isSafe(char[][] board,int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonal top-left
        for(int i=row-1;i>=0;i--){
            for(int j=col-1;j>=0;j--){
                if((row-i==col-j)&&board[i][j]=='Q'){
                    return false;
                }
            }
        }
        //diagonal top-right
        for(int i=row-1;i>=0;i--){
            for(int j=col+1;j<board.length;j++){
                if((i+j==row+col)&&board[i][j]=='Q'){
                    return false;
                }
            }
        }
        return true;
    }
    public static void nqueens(char[][] board,int row){
        //base case
        if(row==board.length){
            System.out.println("<--------BOARD-------->");
            prntbord(board);
            return;
        }
        //recursion
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
            board[row][j]='Q';
            nqueens(board, row+1);
            board[row][j]='X';
            }
        }
    }
    public static void main(String[] args){
        int n=4;
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        nqueens(board,0);
    }
}
