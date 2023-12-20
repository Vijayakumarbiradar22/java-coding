package Patterns.Stars.flatendsquaree;
import java.util.Scanner;
public class flat {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in); 
       System.out.println("Enter the rpws:");
       int n=sc.nextInt();
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
       }
    }
    
}
