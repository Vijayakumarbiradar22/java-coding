package Patterns.Number.primenum;
import java.util.*;
public class prime {
    public static boolean isPrime(int num){
        if(num<2){
            return false;
        }

        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of rows:");
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                while(!isPrime(num)){
                    num++;
                }
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
        sc.close();
    }
    
}
