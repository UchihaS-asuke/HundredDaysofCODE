import java.util.*;
public class spiralmatrixwithfx {
    public static void uzumaki(int[][] matrix,int m,int n){
        int top=0;
        int lft=0;
        int rht=n;
        int btm=m;
        int[][] spiral=new int[m][n];
        while(top>btm&&rht>lft){
            for(int i=lft;i<rht;i++){
                spiral[top][i]=matrix[top][i];
            }top++;
            for(int i=top;i<btm;i++){
                spiral[rht][]
            }
            
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows and columns\n:");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] matrix=new int[4][3];
        uzumaki(matrix,row,col);
    }
}
