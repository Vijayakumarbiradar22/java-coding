package Strings.deletevowels;
import java.util.*;
public class deletevow {
    public static void deleteVowels(String str){
        String noVowels="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' ||
            str.charAt(i)=='e' ||
            str.charAt(i)=='i' ||
            str.charAt(i)=='o' ||
            str.charAt(i)=='u'){
                continue;
            } else {
                noVowels+=str.charAt(i);
            }
        }
        System.out.println(noVowels);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        deleteVowels(str);
        sc.close();
    }
    
}
