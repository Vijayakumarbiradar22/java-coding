package Patterns.Number.fibonacci;
import java.util.*;
public class fib {
    public static void generateFib(int n,int[] fibseries){
        fibseries[0]=0;
        fibseries[1]=1;
        for(int i=2;i<n;i++){
            fibseries[i]=fibseries[i-1]+fibseries[i-2];
        }
    }
    public static void printFib(int n){
        int[] fibseries=new int[n*n];
        generateFib(n*n,fibseries);

        int currIndx=0;

        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(fibseries[currIndx]+" ");
                currIndx++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows:");
        int n=sc.nextInt();
        printFib(n);
        sc.close();
    }
    
}
