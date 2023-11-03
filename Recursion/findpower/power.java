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
        int x=2;
        int n=5;
        int result = findPower(x,n);
        System.out.println(result);
    }
    
}
