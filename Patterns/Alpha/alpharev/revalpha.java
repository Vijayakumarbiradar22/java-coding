package Patterns.Alpha.alpharev;
import java.util.Scanner;
public class revalpha {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of rows:");
        int n=sc.nextInt();
        char alpha=65;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n-1;j++){
                System.out.print(alpha);
                alpha++;
            }
            System.out.println();
        }
        sc.close();
    }
}
