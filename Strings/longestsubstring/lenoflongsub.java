package Strings.longestsubstring;
import java.util.Scanner;
public class lenoflongsub {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        int result=lengthOflongestSubstring(s);
        System.out.println(result);
        sc.close();
    }
    
}
