public class binarytodecimalfx {
    public static int bintodec(int bin){
        int dec=0;
        int pow=0;
        while(bin>0){
            int rem=bin%10;
            dec=dec+rem*((int)Math.pow(2,pow));
            bin/=10;
            pow++;
        }
        return dec;
    }
    public static void main(String[] args){
        int bin=10100101;
        int dec=bintodec(bin);
        System.out.println("Decimal of "+bin+" is "+dec);
    }
}
