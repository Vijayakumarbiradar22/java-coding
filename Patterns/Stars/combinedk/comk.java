package Patterns.Stars.combinedk;
import java.util.Scanner;
public class comk {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows:");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }

            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
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

//It is code for spacediamond(printing stars except diamond in a entire square)
