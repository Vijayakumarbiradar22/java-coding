package Recursion.decreasenum;
import java.util.Scanner;
public class decnum {
    public static void decreaseNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        decreaseNum(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        decreaseNum(n);
        sc.close();
    } 
}
