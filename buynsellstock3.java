public class buynsellstock3 {
    public static int bynselstock(int[] arry){
        int maxprof=0;
        int l=arry.length;
        for(int i=0;i<l-1;i++){
            int buyday=arry[i];
            for(int j=i+1;j<l;j++){
                int selday=arry[j];
                int profit=selday-buyday;
                maxprof=Math.max(profit, maxprof);
            }
        }
        return maxprof;
    }
    public static void main(String[] args){
        int[] arry={7,1,5,3,6,4};
        int maxprof=bynselstock(arry);
        System.out.println(maxprof+" is the maximum profit possible");
    }
}
