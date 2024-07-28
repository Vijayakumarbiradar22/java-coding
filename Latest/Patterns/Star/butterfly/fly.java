package Patterns.Star.butterfly;
import java.util.Scanner;
public class fly {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of rows:");
        int n=sc.nextInt();
        //upper part
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int s=1;s<=2*(n-i);s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower part
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int s=1;s<=2*(n-i);s++){
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
