public class transpose {
    public static int[][] trnspose(int[][] arry){
        int row=arry.length;
        int col=arry[0].length;
        int[][] narry=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                narry[j][i]=arry[i][j];
            }
        }
        return narry;
    }
    public static void main(String[] args){
        int[][] arry={{3,2,1},{8,7,6},{4,9,5}};
        int[][] tnsp=trnspose(arry);
        for(int i=0;i<arry.length;i++)    {
            for(int j=0;j<arry[0].length;j++){
                System.out.print(tnsp[i][j]);
            }
            System.out.println();
        }
    }
}
