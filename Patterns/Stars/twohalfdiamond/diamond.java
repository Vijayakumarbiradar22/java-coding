package Patterns.Stars.twohalfdiamond;
import java.util.Scanner;
public class diamond {
    public static void main(String rgs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
             for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
             for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
