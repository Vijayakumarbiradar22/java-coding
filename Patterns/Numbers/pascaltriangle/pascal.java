package Patterns.Numbers.pascaltriangle;
import java.util.Scanner;
public class pascal {
    public static int fact(int n){
        int factorial=1;
        for(int i=2;i<=n;i++){
            factorial=factorial*i;
        }
        return factorial;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=n;j++){
                System.out.print(fact(i)/(fact(j)*fact(i-j)));
            }
            System.out.println();
        }
    }
    
}
