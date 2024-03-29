package Neetcode.Slidingwindow.longrepeatcharreplace;
import java.util.*;
public class longcharreplace {
    public static int characterReplacement(String s,int k){
        int arr[]=new int[26];
        int res=0;
        int max=0;

        int l=0;
        for(int r=0;r<s.length();r++){
            arr[s.charAt(r)-'A']++;
            max=Math.max(max,arr[s.charAt(r)-'A']);
            if(r-l+1-max>k){
                arr[s.charAt(l)-'A']--;
                l++;
            }
            res=Math.max(res,r-l+1);
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=sc.nextLine();
        System.out.println("Enter a value of k:");
        int k=sc.nextInt();
        int result=characterReplacement(s,k);
        System.out.println(result);
        sc.close();

    }
    
}
