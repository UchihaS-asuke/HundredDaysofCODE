public class palindromecheck {
    public static String revs(String name){
        StringBuilder name1=new StringBuilder(name.length());
        for(int i=0;i<name.length();i++){
            name1.append(name.charAt(name.length()-i-1));
        }
        return name1.toString();
    }
    public static boolean palindromechecker(String name){
        String rname=revs(name);
        boolean ans=true;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)!=rname.charAt(i)){
                ans=false;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        String name="racer";
        System.out.println(palindromechecker(name));
    }
}
