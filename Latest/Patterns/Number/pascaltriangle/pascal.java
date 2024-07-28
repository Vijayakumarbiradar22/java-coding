package Patterns.Number.pascaltriangle;
import java.util.Scanner;
public class pascal {
    public static int fact(int num){
        int factorial=1;
        for(int i=2;i<=num;i++){
            factorial*=i;
        }
        return factorial;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of rows:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(fact(i)/(fact(i-j)*fact(j))+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
