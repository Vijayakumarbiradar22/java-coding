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
       } while(slow!=fast);
       return false;
    }

    public static int square(int num){
        int ans=0;
        while(num>0){
            int rem=num%10;
            ans+=rem*rem;
            num=num/10;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        boolean result = isHappy(n);
        System.out.println(result);
        sc.close();
    }
}
