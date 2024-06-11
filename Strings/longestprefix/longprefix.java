package Strings.longestprefix;
import java.util.*;
public class longprefix {
    public static String longestCommonPrefix(String[] strs){
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int indx=0;
        while(indx<s1.length() && indx<s2.length()){
            if(s1.charAt(indx)==s2.charAt(indx)){
                indx++;
            } else {
                break;
            }
        }
        return s1.substring(0,indx);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        sc.nextLine();
        String[] strs = new String[size];
        System.out.println("Enter the array of Strings");
        for(int i=0;i<size;i++){
            strs[i]=sc.nextLine();
        }

        System.out.println(longestCommonPrefix(strs));

    }
    
}
