package Bitmanupulation.sumoftwointeger;
import java.util.Scanner;
public class sumof2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b=sc.nextInt();

        int result = getSum(a,b);
        System.out.println(result);
    }
    
}
