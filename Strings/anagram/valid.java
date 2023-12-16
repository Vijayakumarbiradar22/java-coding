package Strings.anagram;
import java.util.Scanner;
public class valid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String s:");
        String s=sc.nextLine();
        System.out.println("Enter the string t:");
        String t = sc.nextLine();
        boolean result = isAnagram(s,t);
        System.out.println(result);
        sc.close();
    }
    
}
