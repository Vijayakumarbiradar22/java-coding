package Number.factorial;
import java.util.Scanner;
public class fact {
    public static int findFact(int num){
        int factorial=1;
        for(int i=2;i<=num;i++){
            factorial*=i;
        }
        return factorial;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int result=findFact(num);
        System.out.println(result);
        sc.close();
    }
    
}
