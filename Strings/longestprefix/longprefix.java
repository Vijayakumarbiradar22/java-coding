package Strings.longestprefix;
import java.util.*;
public class longprefix {
    public static String longestCommonPrefix(String[] strs){
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        String[] strs = new String[size];
        System.out.println("Enter the array of Strings");
        for(int i=0;i<size;i++){
            strs[i]=sc.nextLine();
        }

        longestCommonPrefix(strs);

    }
    
}
