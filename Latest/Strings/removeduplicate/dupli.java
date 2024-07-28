package Strings.removeduplicate;
import java.util.*;
public class dupli {
    public static String removeDuplicate(String str){
        Set<Character> seen=new LinkedHashSet<>();
        StringBuilder result=new StringBuilder();
        
        for(char c:str.toCharArray()){
            if(!seen.contains(c)){
                seen.add(c);
                result.append(c);
            }
        }
        return result.toString();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String input=sc.nextLine();
        System.out.println(removeDuplicate(input));
        sc.close();
    }
    
}
