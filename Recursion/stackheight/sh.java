package Recursion.stackheight;
import java.util.*;
public class sh {
    public static int calcPow(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return calcPow(x,n/2)*calcPow(x,n/2);
        } else {
            return calcPow(x,n/2)*calcPow(x,n/2)*x;
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x:");
        int x= sc.nextInt();
        System.out.println("Enter the n:");
        int n = sc.nextInt();

        int result=calcPow(x,n);
        System.out.println(result);

        sc.close();

    }
    
}
