public class recursionfiendspair {
    public static int ways(int num){
        if(num==2||num==1){
            return num;
        }
        int pair=ways(num-2);
        int sngl=ways(num-1);
        return (num-1)*pair+sngl;
    }
    public static void main(String[] args){
        int num=3;
        System.out.println(ways(num));
    }
}
