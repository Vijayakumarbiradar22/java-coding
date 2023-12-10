package HashSet;
import java.util.HashSet;
//import java.util.Iterator;
public class hash {
    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();
        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);

        System.out.println(set);

        //search
        if(set.contains(1)){
            System.out.println("Set has 1");
        }
        if(!set.contains(7)){
            System.out.println("Set does not contains 7");
        }

        //delete
        set.remove(3);
        System.out.println(set);

        System.out.println("Size of set is "+set.size());
        
        // Iterator it = set.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }
    
    }
    
}
