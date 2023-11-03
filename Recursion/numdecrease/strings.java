package Recursion.numdecrease;
import java.util.Scanner;
public class strings {
    public static void printNum(int n){
        if(n==1){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        printNum(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        printNum(n);
    }
    
}
