public class stringcompression {
    public static void cmprs(String name){
        StringBuilder newnam=new StringBuilder("");
        for(int i=0;i<name.length();i++){
            Integer count=1;
            // char ch=name.charAt(i);
            while(i<name.length()-1&&name.charAt(i)==name.charAt(i+1)){
             count++;
                i++;
            }
            newnam.append(name.charAt(i));
            if(count>1){
                newnam.append(count.toString());
            }
        }
        System.out.println(newnam);
    }
    public static void main(String[] args){
        String name="jjjjddddnaassss";
        cmprs(name);
    }
}
