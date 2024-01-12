public class removedupfinal {
    public static void removedup(String name, StringBuilder name1,boolean[] arry,int idx){
        if(idx==name.length()){
            System.out.println(name1.toString());
            return;
        }
        //
        char currchar=name.charAt(idx);
        if(arry[currchar-'a']){
            removedup(name, name1, arry, idx+1);
        }else{
            arry[currchar-'a']=true;
            removedup(name, name1.append(currchar), arry, idx+1);
        }
    }
    public static void main(String[] args){
        String name="sasuke";
        removedup(name,new StringBuilder(""),new boolean[26],0);
    }
}
