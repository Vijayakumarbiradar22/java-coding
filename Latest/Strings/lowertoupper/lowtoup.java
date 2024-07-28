package Strings.lowertoupper;
import java.util.*;
public class lowtoup {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a'&&ch<='z'){
                ch=(char)(ch-32);
            }
            result.append(ch);
        }
        System.out.println(result);
        sc.close();
    }
}
