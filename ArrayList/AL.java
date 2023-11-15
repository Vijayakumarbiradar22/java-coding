package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class AL {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        int get2=list.get(1);
        System.out.println(get2);

        Collections.sort(list);
        System.out.println(list);

        int size = list.size();
        System.out.println(size);
    }
    
}
