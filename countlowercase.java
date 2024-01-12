public class countlowercase {
    public static void countlwrcas(String name){
        int count=0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)>=97&&name.charAt(i)<=122){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String args[]){
        String name="Sasuke Uchiha";
        countlwrcas(name);
    }
}
