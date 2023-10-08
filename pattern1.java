public class pattern1{
    public static void prntptrn1(int a){
        for(int i=1;i<2*a;i++){
            if(i<=a){
                for(int j=1;j<=a-i+1;j++){
                    System.out.print(j);
            }
        }else{
            for(int j=1;j<=i-a+1;j++){
                System.out.print(j);
            }
        }
        System.out.println();
        }
    }
    public static void main(String[] args){
        int i=5;
        prntptrn1(i);
    }
}