package Number.sumofprimenumber;
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number:");
        int start=sc.nextInt();
        System.out.println("Enter the end number:");
        int end=sc.nextInt();
        for(int i=start;i<end;i++){
            if(isPrime(i)){
                int num=i;
                int sum=0;
                while(num!=0){
                    int rem=num%10;
                    sum=sum+rem;
                    num=num/10;
                }
                if(isPrime(sum)){
                    System.out.print(i+" ");
                }
            }
        }
        sc.close();
    }
    
}
