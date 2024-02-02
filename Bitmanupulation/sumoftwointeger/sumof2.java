package Bitmanupulation.sumoftwointeger;
import java.util.Scanner;
public class sumof2 {
    public static int getSum(int a, int b){
        if(b==0){
            return a;
        }
         
        if(b<0){
            return getSum(--a,++b);
        } else {
            return getSum(++a,--b); 
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b=sc.nextInt();

        int result = getSum(a,b);
        System.out.println(result);
        sc.close();
    }
    
}
