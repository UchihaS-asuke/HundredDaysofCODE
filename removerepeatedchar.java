public class removerepeatedchar {
    public static StringBuilder removedup(String name,StringBuilder name1,boolean[] arry,int x){
        if(x==name.length()){
            return name1;
        }
        char currchar=name.charAt(x);
        
        if(!arry[currchar-97]){
            name1.append(name.charAt(x));
            arry[currchar-97]=true;
        }
        return removedup(name, name1, arry, x+1);
    }
    public static void main(String[] args){
        String name="ichigokurosaki";
        StringBuilder name1=new StringBuilder("");
        boolean[] arry=new boolean[26];
        StringBuilder ans=removedup(name,name1,arry,0);
        System.out.println(ans.toString());
    }
}
