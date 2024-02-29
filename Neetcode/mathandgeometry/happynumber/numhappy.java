package Neetcode.mathandgeometry.happynumber;
import java.util.*;
public class numhappy {
    public static boolean isHappy(int n){
       int slow=n;
       int fast=n;

       do{
        slow=square(slow);
        fast=square(square(fast));
        if(slow==1){
            return true;
        }
       }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        isHappy(n);
        sc.close();
    }
}
