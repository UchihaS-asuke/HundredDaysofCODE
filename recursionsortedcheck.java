public class recursionsortedcheck {
    public static boolean truesort(int[] arry,int a){
        if(a==arry.length-1){return true;}
        if(arry[a]<=arry[a+1]){
            
            return truesort(arry, a+1);
        }else{
            return false;
        }
    
    }
    public static void main(String[] args){
        int[] arry={2,3,3,8,10};
        System.out.println(truesort(arry,0));
    }
}
