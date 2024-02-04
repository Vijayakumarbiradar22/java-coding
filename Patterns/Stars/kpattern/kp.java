package Patterns.Stars.kpattern;
import java.util.Scanner;
public class kp {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=2;i<=n;i++){

        }

;        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the total rows:");
        // int n=sc.nextInt();

        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=2;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // sc.close();
        sc.close();
    }
    
}
