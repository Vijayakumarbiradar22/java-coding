package Strings.Uppertolower;
import java.util.*;
public class uptolow {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        StringBuilder result = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A'&& ch<='Z'){
                ch =(char)(ch+32);
            }
            result.append(ch);
        }
        System.out.println(result);
        sc.close();
    }
    
}
