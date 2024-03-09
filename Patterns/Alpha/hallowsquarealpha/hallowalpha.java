package Patterns.Alpha.hallowsquarealpha;
import java.util.Scanner;
public class hallowalpha {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=sc.nextInt();
        int alpha=65;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1 || j==n || i==1 || i==n){
                   System.out.print((char) (alpha+j)); 
                } else {
                    System.out.print(" ");
                }
            }
        }
        sc.close();
    }
    
}
