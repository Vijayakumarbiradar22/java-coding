package Patterns.Numbers.evensamenumber;
import java.util.Scanner;
public class evensame {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
       //int n=5;
       int num=2;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            System.out.print(num+" ");  
        }
        System.out.println();
        num=num+2;
       }
       
       
    }
    
}
