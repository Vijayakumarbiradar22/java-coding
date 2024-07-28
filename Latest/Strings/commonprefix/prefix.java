package Strings.commonprefix;
import java.util.*;
public class prefix {
    public static String longestCommonPrefix(String str[],int n){
        if(n==0){
            return "";
        }
        if(n==1){
            return str[0];
        }

        Arrays.sort(str);
        // for(int i=0;i<n;i++){
        //     System.out.print(str[i]+" ");
        // }
        // int end=Math.min(str[0].length(),str[n-1].length());

        // int i=0;
        // while(i<end && str[0].charAt(i)==str[n-1].charAt(i)){
        //     i++;
        // }
        // String pre=str[0].substring(0,i);
        // return pre;

        //method 2
        String s1=str[0];
        String s2=str[n-1];
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
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        sc.nextLine();
        String str[]=new String[n];
        System.out.println("Enter the string words:");
        for(int i=0;i<n;i++){
            str[i]=sc.nextLine();
        }
        String result=longestCommonPrefix(str,n);
        System.out.println(result);
        sc.close();
    }
    
}
