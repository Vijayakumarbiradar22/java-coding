package Strings.anagram;
import java.util.Scanner;
public class valid {
    public static boolean isAnagram(String s, String t){
        var chars=new int[26];
        for(var c:s.toLowerCase().toCharArray()) chars[c-'a']++;
        for(var c:t.toLowerCase().toCharArray()) chars[c-'a']--;

        for(int i=0;i<26;i++){
            if(chars[i]!=0){
                return false;
            }
        }
        return true;

    }
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
