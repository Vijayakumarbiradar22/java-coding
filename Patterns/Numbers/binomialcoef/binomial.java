package Patterns.Numbers.binomialcoef;
import java.util.Scanner;
public class binomial {
    public static int fact(int n){
        int factorial=1;
        for(int i=2;i<=n;i++){
            factorial=factorial*i;
        }
        return factorial;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(fact(i)/(fact(j)*fact(i-j)));
            }
            System.out.println();
        }
        sc.close();
    }
    
}
