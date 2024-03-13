package Numbers.sumofnum;
import java.util.Scanner;
public class sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int rem,sum=0;
        while(num!=0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("Sum of "+num+" is "+sum);
        sc.close();
    }
    
}
