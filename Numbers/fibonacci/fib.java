package Numbers.fibonacci;
import java.util.Scanner;
public class fib {
    public static void findFib(int a,int b,int n){
        if(n==0){
           return;
        }

        int c=a+b;
        System.out.println(c);
        findFib(b,c,n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=7;
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        findFib(a,b,n-2);
    }
    
}
