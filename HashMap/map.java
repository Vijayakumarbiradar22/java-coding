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
    } 
    
}
