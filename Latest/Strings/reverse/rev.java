package Strings.reverse;
import java.util.*;
public class rev {
    public static void reverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;

            char frontchar=sb.charAt((front));
            char backchar=sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        reverseString(str);
        sc.close();
    }
    
}
