public class turntouppercase2 {
    public static void uprcas(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '&& i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                ch=Character.toUpperCase(str.charAt(i));
                sb.append(ch);
                i++;
            }
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
    public static void main(String[] args){
        String str="oreva uchiha sasuke";
        uprcas(str);
    }
}
