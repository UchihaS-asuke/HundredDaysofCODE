import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args){
        LinkedList<String> linklist=new LinkedList<String>();

        linklist.offer("S");
        linklist.offer("A");
        linklist.push("S");
        linklist.push("U");
        linklist.offer("K");
        linklist.offer("E");
        System.out.println(linklist);
        
        String first=linklist.removeFirst();
        first=linklist.removeFirst();
        System.out.println(linklist);
        linklist.add(2,"S");
        linklist.add(3,"U");
        System.out.println(linklist);
        
    }
}
