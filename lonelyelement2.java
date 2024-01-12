public class lonelyelement2 {
    public static boolean lone(int[] arry,int i){
        int less=arry[i]-1;
        int more=arry[i]+1;
        for(int j=0;j<arry.length;j++){
            if(arry[j]==more||arry[j]==less){
                return false;
            }
        }
        return true;
    }
    public static void lonely(int[] arry){
        for(int i=0;i<arry.length;i++){
            if(lone(arry,i)){
                System.out.print(arry[i]+" ");
            }
        }
    }
    public static void main(String[] args){
        int[] arry={3,4,5,7,9};
        lonely(arry);
    }
}
