package Patterns.Numbers.decfour;
import java.util.Scanner;
public class num4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows:");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<i){
                    System.out.print(n+j-i);
                } else {
                    System.out.print(n);
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
