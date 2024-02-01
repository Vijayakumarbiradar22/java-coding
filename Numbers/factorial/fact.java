package Numbers.factorial;
import java.util.Scanner;
public class fact {
    public static void findFact(int n){
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for factorial:");
        int n = sc.nextInt();
        findFact(n);
        sc.close();
    }
}
