package Strings.extractnumbers;
import java.util.*;
public class exnum {
    private static final Map<String,Integer> numberMap=new HashMap<>();
    static {
        numberMap.put("zero",0);
        numberMap.put("one",1);
        numberMap.put("two",2);
        numberMap.put("three",3);
        numberMap.put("four",4);
        numberMap.put("five",5);
        numberMap.put("six",6);
        numberMap.put("seven",7);
        numberMap.put("eight",8);
        numberMap.put("nine",9);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input=sc.nextLine();
        StringBuilder result = new StringBuilder();

        for(String word:numberMap.keySet()){
            while(input.contains(word)){
                result.append(numberMap.get(word));
                input=input.replaceFirst(word,"");
            }
        }
        System.out.println(result.toString());
        sc.close();
    }
    
}
