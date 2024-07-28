package Strings.leftrotate;
import java.util.*;
public class left {
    public static String leftRotate(String str1,int rt){
        String ans=str1.substring(rt)+str1.substring(0,rt);
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str1=sc.nextLine();
        System.out.println("Enter the rotation times");
        int rt=sc.nextInt();
        System.out.println(leftRotate(str1,rt));
        sc.close();
    }
    
}
