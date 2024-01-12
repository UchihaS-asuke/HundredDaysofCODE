public class unsolvednqueenspossibleornot {
    public static boolean isSafe(char[][] board,int row,int col){
        //vertically up
        for(int i=col-1;i>=0;i--){
            if(board[row][i]=='Q'){
                return false;
            }
        }
        //top right
        for(int i=row,j=col;i<board.length&&j>=0;i++,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //top left
        for(int i=row,j=col;i>=0&&j>=0;j--,i--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void prntbord(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static boolean nqueen(char[][] board,int row){
        //base case
        if(row==board.length){
            // prntbord(board);
            return true;
        }
        //recursion
        for(int i=0;i<board.length;i++){
            if(isSafe(board,row,i)){
                board[row][i]='Q';
                if(nqueen(board, row+1)){
                    return true;
                }
                board[row][i]='X';
            }
            
        }
        return false;
    }
    public static void main(String[] args){
        int n=4;
        if(n<4){
            System.out.println("No, it is not possible");
        }else{
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        if(nqueen(board,0)){
            System.out.println("Yes, it is possible");
            prntbord(board);
        }else{
            System.out.println("No, it isn't possible");
        }

    }
}
}