package Number.sumofnumber;
import java.util.*;
public class sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int rem=0,sum=0;
        while(num!=0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("Sum of digits is "+sum);
        sc.close();
    }
    
}
