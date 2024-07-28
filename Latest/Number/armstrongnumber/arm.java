package Number.armstrongnumber;
import java.util.*;
public class arm {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int original=num;
        double rem=0,sum=0;
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        num=original;
        while(num!=0){
            rem=num%10;
            sum=sum+Math.pow(rem, count);
            num=num/10;
        }

        if(original==sum){
            System.out.println(original+" is Armstrong number.");
        } else {
            System.out.println(original+" is not Armstrong number.");
        }
        sc.close();
    }
    
}
