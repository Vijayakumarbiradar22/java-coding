package Recursion.increasenum;
import java.util.Scanner;
public class numin {
    public static void increaseNum(int n){
        if(n==5){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        increaseNum(n+1);
    }
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number:");
            int n = sc.nextInt();
            increaseNum(n);
            sc.close();
    }
    
}
