package Patterns.Numbers.primenumber;
import java.util.Scanner;
public class prime {
    public static boolean isPrime(int num){
        
    }
    // public static boolean isPrime(int num){
    //     if(num<2){
    //         return false;
    //     }
    //     for(int i=2;i<=Math.sqrt(num);i++){
    //         if(num%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    public static void primePattern(int rows){
        int currNum=1;
        for(int i=1;i<=rows;i++){
           for(int j=1;j<=i;j++){
            while(!isPrime(currNum)){
                currNum++;
            }
            System.out.print(currNum+" ");
            currNum++;
           } 
           System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows:");
        int rows=sc.nextInt();

        primePattern(rows);

      sc.close();
    }
    
}
