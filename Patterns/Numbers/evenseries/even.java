package Patterns.Numbers.evenseries;
import java.util.Scanner;
public class even {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows:");
        int n = sc.nextInt();
        int num=2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num=num+2;
            }
        }
    }
    
}
