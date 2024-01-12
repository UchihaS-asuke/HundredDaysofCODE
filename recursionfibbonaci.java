public class recursionfibbonaci {
    public static int fibb(int a){
        if(a==1||a==0){
            return 1;
        }
        return fibb(a-2)+fibb(a-1);
        // 0 1 1 2 3 5 8 
    }
    public static void main(String[] args){
        int a=5;
        int ans=fibb(a);
        System.out.println(ans);
    }
}
