public class placingnqueens {
    public static void prntbord(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]);
            }
                System.out.println();
        }
    }
    //public static boolean isSafe(char[][] board,int row){//Code to check if square is safe or not}
    public static void nqueens(char[][] board,int row){
        //base case
        if(row==board.length){
            System.out.println("<--------BOARD-------->");
            prntbord(board);
            return;
        }
        //recursion
        for(int j=0;j<board.length;j++){
            //if(isSafe(board,j)){
            board[row][j]='Q';
            nqueens(board, row+1);
            board[row][j]='X';
            //}
        }
    }
    public static void main(String[] args){
        int n=3;
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        nqueens(board,0);
    }
}
