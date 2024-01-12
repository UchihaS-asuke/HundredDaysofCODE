public class frequencyofelem {
    public static void frequency(int[][] arry,int x){
        int count=0;
        for(int i=0;i<arry.length;i++){
            for(int j=0;j<arry[0].length;j++){
                if(arry[i][j]==x){count++;}
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        int[][] arry={{10,15,20,25},
            {27,29,30,32},
            {33,35,37,39},
            {40,45,48,50}};
            frequency(arry,35);
    }
}
