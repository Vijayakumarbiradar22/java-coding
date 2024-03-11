package Numbers.factorial;
import java.util.Scanner;
public class fact {
    public static int findFact(int n){
        int factorial=1;
        for(int i=2;i<=n;i++){
            factorial = factorial*i;
        }
        return factorial;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find factorial:");
        int n = sc.nextInt();
        int result = findFact(n);
        System.out.println(result);
        sc.close();
    }
}
