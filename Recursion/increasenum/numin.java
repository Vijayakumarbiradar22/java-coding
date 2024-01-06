package Recursion.increasenum;
import java.util.Scanner;
public class numin {
    public static void printNum(int n){
        if(n==5){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        printNum(n+1);
    }
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number:");
            int n = sc.nextInt();
            //int n=1;
            printNum(n);
            sc.close();
    }
    
}
