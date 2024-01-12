public class checkforrepeatedelements {
    public static boolean chkdbl(int[] arry){
        int l=arry.length;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if(arry[i]==arry[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arry={4,6,8,9,4,2,3};
        boolean dstnct=chkdbl(arry);
        System.out.println(dstnct);
    }
}
