public class recursionrevsrprint {
    public static void reverseprint(int a){
       System.out.println(a);
       if(a>0){
        reverseprint(a-1);
       }
        
    }
    public static void main(String[] args){
        reverseprint(10);
    }
}
