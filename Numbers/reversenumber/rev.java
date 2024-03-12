package Numbers.reversenumber;
import java.util.Scanner;
public class rev {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int rem,revNum=0;
        int temp=num;
        while(num!=0){
            rem=num%10;
            revNum=revNum*10+rem;
            num=num/10;
        }
        System.out.println("Reverse of the "+temp+" is"+revNum);
        if(revNum==temp){
            System.out.println(temp+" is palindrome number");
        } else {
            System.out.println(temp+" is not palindrome number");
        }
        sc.close();
    }
    
}
