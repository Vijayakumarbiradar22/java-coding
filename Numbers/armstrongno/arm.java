package Numbers.armstrongno;
import java.util.Scanner;
public class arm {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check wheather it is an Armstrong:");
        int num=sc.nextInt();
        int count=0;
        double rem,sum=0;
        int original=num;
        while(num!=0){
            num=num/10;
            count++;
        }

        num=original;
        while(num!=0){
            rem=num%10;
            sum=sum+Math.pow(rem,count);
            num=num/10;
        }
        if(original==sum){
            System.out.println(original+" is an Armstrong Number");
        } else {
           System.out.println(original+" is not an Armstrong Number"); 
        }
        sc.close();
    }
}
