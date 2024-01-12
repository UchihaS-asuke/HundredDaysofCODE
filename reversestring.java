public class reversestring {
    public static String revs(String name){
        StringBuilder name1=new StringBuilder(name.length());
        for(int i=0;i<name.length();i++){
            name1.append(name.charAt(name.length()-i-1));
        }
        return name1.toString();
    }
    public static void main(String[] args){
        String name="Shirohige Da";
        String rnam=revs(name);
        System.out.println(rnam); 
    }
}
