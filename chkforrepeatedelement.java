public class chkforrepeatedelement{
    public static void chkelem(int[] arry){
        int l=arry.length;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if(i!=j&&arry[i]==arry[j]){
                    System.out.println(arry[i]+" was repeated at index "+j);
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arry={4,6,8,9,4,2,3,4};
        chkelem(arry);
    }
}