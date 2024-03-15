package Numbers.primenumber;
import java.util.Scanner;
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start number:");
        int start=sc.nextInt();
        System.out.println("Enter the end number:");
        int end=sc.nextInt();
        for(int i=start;i<end;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
