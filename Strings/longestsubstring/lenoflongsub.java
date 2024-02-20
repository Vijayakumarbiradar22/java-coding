package Strings.longestsubstring;
import java.util.Scanner;
import java.util.*;
public class lenoflongsub {
    public static int lengthOflongestSubstring(String s){
        Set<Character> set = new HashSet<>();
        int maxLength=0;
        int left=0;

        for(int right=0;right<s.length();right++){
            
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        int result=lengthOflongestSubstring(s);
        System.out.println(result);
        sc.close();
    }
    
}
