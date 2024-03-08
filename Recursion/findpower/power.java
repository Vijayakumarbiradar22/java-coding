package Recursion.findpower;
import java.util.Scanner;
public class power {
    public static int findPower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

        int powm1 = findPower(x,n-1);
        int pow = x*powm1;
        return pow;
    }
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter x:");
            int x = sc.nextInt();
            System.out.println("Enter the n:");
            int n = sc.nextInt();
            int result = findPower(x,n);
            System.out.println(result);
            sc.close();
    }
    
}
