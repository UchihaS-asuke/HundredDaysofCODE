import java.util.LinkedList;

public class reverselinkedlist {
    public static void main(String[] args){
        LinkedList<String> linklist=new LinkedList<String>();
            linklist.offer("S");
            linklist.offer("A");
            linklist.offer("S");
            linklist.offer("A");
            System.out.println(linklist);
            String name=new String();
            String[] arry=new String[4];
        for(int i=0;i<4;i++){
            name=linklist.removeLast();
            arry[i]=name;
        }
        System.out.println(linklist);
        System.out.println(name);
        System.out.println();
        for(int i=0;i<arry.length;i++){
            System.out.print(arry[i]+" ");
        }
    }
}
