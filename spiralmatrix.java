public class spiralmatrix {
    public static void uzumaki(int[][] matrix,int ro,int co){
        int l=0;
        int t=0;
        int r=co-1;
        int b=ro-1;
        int count=0;
        while(count<ro*co){
            
            for(int i=t,j=0;j<=r;j++){
                System.out.print(matrix[i][j]+" ");
                count++;
                 if(count%co==0){
                System.out.println();
            }
            }
           if(count==12){
            break;
           }
            t++;
            for(int j=r,i=t;i<=b;i++){
                System.out.print(matrix[i][j]+" ");
                count++;
                 if(count%co==0){
                System.out.println();
            }
            }
            if(count==12){
            break;
           }
            r--;
            for(int i=b,j=r;j>=0;j--){
                System.out.print(matrix[i][j]+" ");
                count++;
                 if(count%co==0){
                System.out.println();
            }
            }
            if(count==12){
            break;
           }
            b--;
            for(int j=l,i=b;i>t;i--){
                System.out.print(matrix[i][j]+" ");
                count++;
                 if(count%co==0){
                System.out.println();
            }
            }
            
            l--;
        }
    }
    public static void main(String[] args){
        int[][] matrix={{9,5,1},{6,2,7},{3,8,4},{4,5,6}};
        int row=4;
        int col=3;
        uzumaki(matrix,row,col);
    }
}
