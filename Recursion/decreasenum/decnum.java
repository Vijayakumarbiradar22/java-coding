package Recursion.decreasenum;
import java.util.Scanner;
public class decnum {
    public static void decreaseNumber(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        decreaseNumber(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n=5;
        decreaseNumber(n);
    }
    
}
