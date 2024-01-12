public class sumofarow {
    public static void rowsum(int[][] arry,int x){
        int sum=0;
        for(int i=x-1,j=0;j<arry[0].length;j++){
            sum+=arry[i][j];
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        int[][] arry={{10,15,20,25},
            {27,29,30,32},
            {33,35,37,39},
            {40,45,48,50}};
            rowsum(arry,3);
    }
}
