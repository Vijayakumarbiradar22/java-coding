package Number.reversenumber;
import java.util.Scanner;
public class reverse {
    public static int findReverse(int num){
        int rem=0;
        int revNum=0;
        while(num!=0){
            rem=num%10;
            revNum=revNum*10+rem;
            num=num/10;
        }
        return revNum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=sc.nextInt();
        int result=findReverse(num);
        System.out.println(result);
        if(num==result){
            System.out.println("It is a Palindrome number");
        } else {
            System.out.println("It is not Palindrome number");
        }
        sc.close();
    }
    
}
