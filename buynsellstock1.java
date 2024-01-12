public class buynsellstock1 {
    public static int bestbuy(int[] arry){
        int l=arry.length;
        int highestsell=arry[l-1] ;
        int lowestbuy=arry[1];
        // int hs=l-1;
        // int lb=0;
        int profit=0;
        for(int i=0;i<l;i++){
            for(int j=0;j<l-1;j++){
            if(highestsell<arry[j+1]){
                highestsell=arry[j+1];
                // hs=j+1;
            }
            if(lowestbuy>arry[i]){
                lowestbuy=arry[i];
                // lb=i;
            }
            int tempprof=highestsell-lowestbuy;
            if(tempprof>profit){
                profit=tempprof;
            }

            }
        }
        return profit;
    }
    public static void main(String[] args){
        int[] arry={7,1,5,3,6,4};
        System.out.println(bestbuy(arry));
    }
}
