package Strings.anagram;
import java.util.*;
public class ana {
    public static Boolean areAnagram(String str1,String str2){
        str1.replaceAll("\\s", "");
        str2.replaceAll("\\s", "");

        if(str1.length()!=str2.length()){
            return false;
        }

        char[] charArray1=str1.toCharArray();
        char[] charArray2=str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1,charArray2);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string1:");
        String str1=sc.nextLine();
        System.out.println("Enter the string 2:");
        String str2=sc.nextLine();
        Boolean result=areAnagram(str1,str2);
        System.out.println(result);
        sc.close();
    }
    
}
