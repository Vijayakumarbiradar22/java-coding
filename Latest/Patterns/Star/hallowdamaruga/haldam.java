package Patterns.Star.hallowdamaruga;
import java.util.Scanner;
public class haldam {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows:");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=2*n-1;j++){
                if(j==n-i+1 || j==n+i-1 || i==n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i=2;i<=n;i++){
            for(int j=1;j<=2*n-1;j++){
                if(j==n-i+1 || j==n+i-1 || i==n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
