public class decimaltobinary {
    public static int dectobin(int dec){
        int bin=0;
        int pow=0;
        while(dec>0){
            int rem=dec%2;
            bin=bin+rem*(int)Math.pow(10,pow);
            dec/=2;
            pow++;
        }
        return bin;
    }
    public static void main(String[] args){
        int dec=165;
        int bin=dectobin(dec);
        System.out.println("Binary of the given Decimal number is"+bin);
    }
}
