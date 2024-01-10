package Patterns.Numbers.nextnumber;
import java.util.Scanner;
public class nextnum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows:");
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
               System.out.print(num+" ");
               num++; 
            }
            System.out.println();
        }
        sc.close();
    }
    
}
