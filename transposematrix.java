public class transposematrix {
    public static int[][] transpose(int[][] matrix,int m,int n){
        int[][] trsp=new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                trsp[i][j]=matrix[j][i];
            }
        }
        return trsp;
    }
    public static void main(String[] args){
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix1=transpose(matrix,3,3);
        int m=3;
        int n=3;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix1[i][j]);
            }
            System.out.println();
        }
    }
}
