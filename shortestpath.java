public class shortestpath {
    public static float mindst(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='s'){
                y--;
            }else if(str.charAt(i)=='n'){
                y++;
            }else if(str.charAt(i)=='w'){
                x--;
            }else{
                x++;
            }
        }
        int xX=x*x;
        int xY=y*y;
        return (float)Math.sqrt(xX+xY);
    }
    public static void main(String[] args){
        String str="wneenesennn";
        System.out.println(mindst(str));
    }
}
