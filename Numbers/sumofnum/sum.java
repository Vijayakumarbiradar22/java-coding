package Numbers.sumofnum;
import java.util.Scanner;
public class sum {
    public static void main(String args[]){
        int rem,sum=0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number:");
            int num=sc.nextInt();
            while(num>0){
                rem = num%10;
                sum=sum+rem;
                num=num/10;
            }
        }
        System.out.println(sum);

    }
    
}
