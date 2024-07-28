package Patterns.Star.damaruga;
import java.util.Scanner;
public class damaru {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows:");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=2;i<=n;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }                                  
    
}
