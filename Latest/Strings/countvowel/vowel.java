package Strings.countvowel;
import java.util.*;
public class vowel {
    public static void countVowels(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.toLowerCase().charAt(i)=='a'||
            str.toLowerCase().charAt(i)=='e'||
            str.toLowerCase().charAt(i)=='i'||
            str.toLowerCase().charAt(i)=='o'||
            str.toLowerCase().charAt(i)=='u'){
                if(str.charAt(i)!=' '){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentance:");
        String str=sc.nextLine();
        countVowels(str);
        sc.close();
    }
    
}
