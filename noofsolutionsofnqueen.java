public class noofsolutionsofnqueen {
    public static void prntbord(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static boolean isSafe(char[][] board,int row,int col){
        //vertically up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //top right
        for(int i=row-1,j=col+1;j<board.length&&i>=0;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //top left
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nqueen(char[][] board,int row){
        
        //base case
        if(row==board.length){
            // prntbord(board);
            count++;
           return;
        }
        //recursion
        for(int i=0;i<board.length;i++){
            if(isSafe(board,row,i)){
                board[row][i]='Q';
                nqueen(board,row+1);
                board[row][i]='X';
            }
        
    }
}
    static int count=0;
    public static void main(String[] args){
        int n=5;
        char[][] board=new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='X';
            }
        }
        nqueen(board,0);
        System.out.println(count);
    }
}
