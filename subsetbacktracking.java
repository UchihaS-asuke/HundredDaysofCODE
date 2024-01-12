public class subsetbacktracking {
    public static void prntstrg(String name){
        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i));
        }
    }
    public static void subset(String name,int i,String ans){
        //base case
        if(i==name.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            prntstrg(ans);
            System.out.println();
            return;
        }
        //recursion
        //Yes Choice
        subset(name, i+1, ans+name.charAt(i));
        //No Choice
        subset(name, i+1, ans);
       
    }
    public static void main(String[] args){
        String name="Uchiha";
        subset(name,0,new String());
    }
}
