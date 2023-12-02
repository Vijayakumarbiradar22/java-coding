package Patterns.Numbers.reversenum;
import java.util.Scanner;
public class rev {
    public static void main(String args[]){
        int num=10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows:");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num--;
            }
            System.out.println();
        }
    }
    
}
