package Patterns.Numbers.hallowdiamond;
import java.util.Scanner;
public class halnum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows:");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*n-i;j++){
                if(j==n+i-1 || j==n-i+1 || i==n){
                    System.out.print("i");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
