public class avgofthreewithfx {
    public static float avgofthr(int a,int b,int c){
        return  (a+b+c)/3f;
    }
    public static void main(String[] args){
        int a=3;
        int b=5;
        int c=9;
        float avg=avgofthr(a,b,c);
        System.out.println("Average of 3 digits is "+avg);
    }
}
