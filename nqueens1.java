public class nqueens1 {
public static void prntbrd(char[][] board){
    for(int i=0;i<board.length;i++){
        for(int j=0;j<board[0].length;j++){
            System.out.print(board[i][j]);
        }
        System.out.println();
    }
}
public static boolean isSafe(char[][] board,int row,int col){
    int qrow=0;
    int qcol=0;
    for(int i=0;i<row;i++){
        for(int j=0;j<board[0].length;j++){
            if(board[i][j]=='Q'){
                qrow=i;
                qcol=j;
            }
        }
    }
        if(qcol==col){
            return false;
        }
        if(qcol-col==qrow-row){
            return false;
        }
        
            return true;
        
    }

public static void nqueen(char[][] board,int row){
    //base case
    if(row==board.length){
        prntbrd(board);
        System.out.println("<---------------------->");
        return;
    }

    //recursion
    
        for(int j=0;j<board[0].length;j++){
            if(isSafe(board,row,j)){
            board[row][j]='Q';
            nqueen(board, row+1);
            board[row][j]='X';
            }
        }
    }
    public static void main(String[] args){
        int n=4;
        char[][] board=new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j]='X';
            }
        }
        nqueen(board,0);
    }
}
