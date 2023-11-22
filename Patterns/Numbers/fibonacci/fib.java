package Patterns.Numbers.fibonacci;
import java.util.Scanner;
public class fib {
    public static void generateFib(int n,int fibseries[]){
        fibseries[0]=0;
        fibseries[1]=1;
        for(int i=2;i<n;i++){
            fibseries[i]=fibseries[i-1]+fibseries[i-2];
        }
    }

    public static void printFib(int n){
        int[] fibseries = new int[n*n];
        generateFib(n*n,fibseries);

        int currIndex=0;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(fibseries[currIndex]);
                currIndex++;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows:");
        int n=sc.nextInt();
        printFib(n);
        sc.close();
    }
    
}
