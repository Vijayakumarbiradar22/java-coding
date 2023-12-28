package Patterns.Numbers.negativenumber;
import java.util.Scanner;
public class negative {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num=0;
        System.out.println("Enter the no.of rows:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num--;
            }
            System.out.println();
        }

        sc.close();
    }
    
}
