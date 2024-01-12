public class permutationsbacktracking {
    public static void permutation(String name,String ans){
        if(name.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<name.length();i++){
            char curr=name.charAt(i);
            String newstr=name.substring(0, i)+name.substring(i+1);
            permutation(newstr,ans+curr);
        }
    }
    public static void main(String[] args){
        String name="Nag";
        permutation(name,new String());
    }
}
