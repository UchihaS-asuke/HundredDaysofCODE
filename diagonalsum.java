public class diagonalsum {
    public static int dgnlsm(int[][] arry){
        int sum=0;
        for(int i=0;i<arry.length;i++){
            sum+=arry[i][i];
            if(i!=arry.length-1-i){
                sum+=arry[i][arry.length-i-1];
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int[][] arry={{3,5,7},{2,4,6},{9,6,3}};
        System.out.println(dgnlsm(arry));
    }
}
