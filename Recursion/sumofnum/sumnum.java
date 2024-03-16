package Recursion.sumofnum;
import java.util.Scanner;
public class sumnum {
    public static void printSum(int i,int n, int sum){
        if(i==n){
            sum=sum+i;
            System.out.println("Sum of the number is "+sum);
            return;
        }

        sum = sum+i;
        printSum(i+1, n, sum);

    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the start number:");
        int start=sc.nextInt();
        System.out.println("Enter the end number:");
        int end=sc.nextInt();
        int sum = 0;
        printSum(start,end,sum);
        sc.close();
    }
    
}
