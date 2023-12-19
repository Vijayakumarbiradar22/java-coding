package Patterns.Stars.invertkpattern;
import java.util.Scanner;
public class invertk {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the rows:");
       int n=sc.nextInt(); 

       for(int i=n;i>=1;i--){
        for(int s=1;s<=n-i;s++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
       }
    }
    
}
