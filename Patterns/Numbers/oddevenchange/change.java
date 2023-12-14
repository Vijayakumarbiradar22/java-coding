package Patterns.Numbers.oddevenchange;
import java.util.Scanner;
public class change {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows:");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2==0){
                    System.out.print(i-j+1);
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
    
}
