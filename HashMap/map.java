package HashMap;
import java.util.*;
public class map {
    public static void main(String args[]){
        //country(key) and population(value)
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India",120);
        map.put("USA",30);
        map.put("China",110);
        System.out.println(map);
        map.put("china",180);
        System.out.println(map);

        //search
        if(map.containsKey("China")){
            System.out.println("Key Present in the map");
        } else {
            System.out.println(" Key is not present");
        }

        System.out.println(map.get("China"));
        System.out.println(map.get("Srilanka"));

        //Entryset through
        for(Map.Entry<String,Integer>e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //Keyset through
        Set<String> keys = map.keySet();
        for(String key:keys){
            System.out.println(key+" "+map.get(key));
        }

        map.remove("China");
        System.out.println(map);
        

    } 
    
}
