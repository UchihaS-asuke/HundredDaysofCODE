public class diagonasumdoubleloop {
    public static int diegnlsm(int[][] arry){
        int sum=0;
        for(int i=0;i<arry.length;i++){
            for(int j=0;j<arry[0].length;j++){
                if(i==j){
                    sum+=arry[i][j];
                }else if(i+j==arry.length-1){
                    sum+=arry[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int[][] arry={{3,5,7},{2,4,6},{9,6,3}};//26
        int sum=diegnlsm(arry);
        System.out.println(sum);
    }
}
