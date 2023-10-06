public class hollowrectwithfx {
    public static void holorect(int l,int b){
        for(int i=0;i<b;i++){
            for(int j=0;j<l;j++){
                if(i==0||i==b-1||j==0||j==l-1){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int length=5;
        int breadth=3;
        holorect(length,breadth);
    }
}
