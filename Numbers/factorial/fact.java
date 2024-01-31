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
        
        int n=5;
        findFact(n);
    }
    
}
