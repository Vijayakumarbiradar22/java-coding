package LinkedList.directmethod;
import java.util.*;
public class lists {
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("10");
        list.addLast("20");
        list.addLast("30");
        list.addLast("40");
        
        list.removeFirst();
        list.removeLast();

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("NULL");
    }
}
