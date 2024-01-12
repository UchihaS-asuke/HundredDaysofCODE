public class turntouppercase {
    public static String uprcas(String sb){
        StringBuilder str=new StringBuilder("");
        char ch=Character.toUpperCase(sb.charAt(0));
        str.append(ch);
        for(int i=1;i<sb.length();i++){
        if(sb.charAt(i-1)==' ') {
            ch=Character.toUpperCase(sb.charAt(i));
        }else{
            ch=sb.charAt(i);
        }    
        str.append(ch);
    }
        
        return str.toString();
    }
    public static void main(String[] args){
        String sb="oreva dhirohige da";
        System.out.println(uprcas(sb));
    }
}
