package Strings.stringjoiner;
import java.util.ArrayList;
import java.util.StringJoiner;
public class join {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();
        list.add("Raj");
        list.add("Dundesh");
        list.add("Sachin");
        list.add("Vijay");

        StringJoiner sj1 = new StringJoiner(",");

        sj1.setEmptyValue("sj1 is empty");
        System.out.println(sj1);

        sj1.add(list.get(0)).add(list.get(1));
        System.out.println(sj1);

        System.out.println("Length of sj1 "+sj1.length());

        StringJoiner sj2 = new StringJoiner(":");
        sj2.add(list.get(2)).add(list.get(3));
        System.out.println(sj2);
        System.out.println("Length of sj2 "+sj2.length());

        sj1.merge(sj2);
        System.out.println(sj1);
        System.out.println("Length of sj1 is "+sj1.length());
    }
    
}
