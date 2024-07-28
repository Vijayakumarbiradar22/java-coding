package Strings.substring;
import java.util.*;
public class sub {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        System.out.println("Enter the rt:");
        int rt=sc.nextInt();
        String ans=str.substring(rt)+str.substring(0,rt);
        System.out.println(ans);
        sc.close();
    }
    
}
