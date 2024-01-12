public class binarystringrecursion {
    public static void printbinary(int n,int lst,String str){
        if(n==0){
          System.out.println(str);
          return;
        }
        printbinary(n-1, 0, str+"0");
        if(lst==0){
            printbinary(n-1,1,str+"1");
        }
    }
    public static void main(String[] args){
        int n=5;
        int x=0;
        String str="";
        printbinary(n,x,str);
    }
}
