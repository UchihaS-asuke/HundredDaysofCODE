public class containerwithmostwater {
    public static int min(int a,int b){
        if(a<b){
            return a;
        }
        return b;
    }
    public static int maxwater(int[] arry){
        int cap=0;
        for(int i=0;i<arry.length;i++){
            for(int j=i+1;j<arry.length;j++){
                int height=min(arry[i],arry[j]);
                int width=j-i;
                int currcap=height*width;
                if(cap<currcap){
                    cap=currcap;
                }
            }
        }
        return cap;
    }
    public static void main(String[] args){
        int[] arry={1,8,6,2,5,4,8,3,7};
        System.out.println(maxwater(arry));
    }
}
