package Patterns.Numbers.oddseries;
import java.util.Scanner;
public class odd {
    public static void main(String args[]){
        int num=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of rows:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num+=2;
            }
            System.out.println();
        }
        sc.close();
    }
}
