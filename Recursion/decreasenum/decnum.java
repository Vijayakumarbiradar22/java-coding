package Recursion.decreasenum;
import java.util.Scanner;
public class decnum {
    public static void decreaseNumber(int n){
       System.out.println(n);
       
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decreaseNumber(n);
        sc.close();
    }
    
}
