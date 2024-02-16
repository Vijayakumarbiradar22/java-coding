package Patterns.Stars.mixofstarnum;
import java.util.Scanner;
public class mix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=1;j<=n;j++){
                if(i%2==0){
                    System.out.print("*"+" ");
                } else {
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }

        
    }
    
}
