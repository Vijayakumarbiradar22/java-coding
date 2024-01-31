package Numbers.reversenumber;
import java.util.Scanner;
public class rev {
    public static void main(String args[]){
        int rem,revNum=0;
        int num=1234;
        int temp=num;
        while(num>0){
            rem=num%10;
            revNum=revNum*10+rem;
            num=num/10;
        }
        System.out.println(revNum);
        if(revNum==temp){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
    
}
