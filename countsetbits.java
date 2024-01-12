public class countsetbits{
    public static void countsetbit(int a){
        int count=0;
        while(a>0){
            if((a&1)==1){
                count++;
            }
            a=a>>1;
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        int a=85;
        //1010101->4;
        countsetbit(a);
    }
}