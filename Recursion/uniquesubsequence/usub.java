package Recursion.uniquesubsequence;
import java.util.HashSet;
public class usub {
    public static void usubseq(String str,int indx,String newString,HashSet<String> set){
        if(indx==str.length()){
            if(set.contains(newString)){
               return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currChar = str.charAt(indx);
        usubseq(str, indx+1, newString+currChar, set);
        usubseq(str, indx+1, newString, set);
    }
    public static void main(String args[]){
        String str = "aaaa";
        HashSet<String> set = new HashSet<>();
        usubseq(str, 0, "", set);
    }
    
}
