package Patterns.Numbers.butterflynum;
import java.util.*;
public class fly {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        
       int n=5;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        int sp=2*(n-i);
        for(int s=1;s<=sp;s++){
            System.out.print(" ");
        }

        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
       } 

       for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        int sp =2*(n-i);
        for(int s=1;s<=sp;s++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
       }

    }
    
}
