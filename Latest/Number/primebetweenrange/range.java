package Number.primebetweenrange;
import java.util.*;
public class range {
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
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the start number:");
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
