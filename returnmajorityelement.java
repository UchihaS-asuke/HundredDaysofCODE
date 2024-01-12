public class returnmajorityelement {
    public static int rtnmjrelm(int[] arry){
        int major=arry.length/2;
        int rtn=-1;
        for(int i=0;i<arry.length;i++){
            int count=0;
            for(int j=0;j<arry.length;j++){
                if(arry[i]==arry[j]){
                    count+=1;
                }
            }
            if(count>=major){
                rtn=arry[i];
            }
        }
        return rtn;
    }
    public static void main(String[] args){
        int[] arry={2,2,2,2,3,4,4,};
        System.out.println(rtnmjrelm(arry));
    }
}
