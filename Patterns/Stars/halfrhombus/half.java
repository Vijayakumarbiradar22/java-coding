package Patterns.Stars.halfrhombus;
import java.util.Scanner;
public class half {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){
           for(int j=1;j<=i;j++){
            System.out.print("*");
           } 
           System.out.println();
        }
        sc.close();
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the no.of rows:");
        // int n = sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=n-1;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // sc.close();
    }
    
}
